/*
 * Copyright (C) 2008  Genome Research Limited
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 *  @author: Tim Carver
 */

package uk.ac.sanger.artemis.circular;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.FeatureKeyPredicate;
import uk.ac.sanger.artemis.FeatureKeyQualifierPredicate;
import uk.ac.sanger.artemis.FeaturePredicate;
import uk.ac.sanger.artemis.FeaturePredicateConjunction;
import uk.ac.sanger.artemis.FeaturePredicateVector;
import uk.ac.sanger.artemis.FeatureVector;
import uk.ac.sanger.artemis.components.KeyChoice;
import uk.ac.sanger.artemis.components.QualifierChoice;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.Range;
import uk.ac.sanger.artemis.io.RangeVector;

class TrackViewer extends JFrame
{
  private static final long serialVersionUID = 1L;
  private DNADraw dnaDraw;
  
  public TrackViewer(final DNADraw dnaDraw)
  {
    super("Track Manager");
    this.dnaDraw = dnaDraw;
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    JScrollPane jsp = new JScrollPane(getPanelComponents());
    getContentPane().add(jsp); 
    pack();
  }
  
  protected void refresh()
  {
    getContentPane().removeAll();
    getContentPane().add(getPanelComponents()); 
    pack();
  }
  
  private JPanel getPanelComponents()
  {
    final Track[] tracks = Wizard.getTracks();
    GridBagLayout grid = new GridBagLayout();
    final GridBagConstraints c = new GridBagConstraints();
    c.ipady = 3;
    c.ipadx = 5;

    final JPanel optionBox = new JPanel(grid);
    final KeyChoice keyChoice[] = new KeyChoice[tracks.length];
    final QualifierChoice qualifierChoice[] = new QualifierChoice[tracks.length];
    final JTextField qualifierValue[] = new JTextField[tracks.length];
    final JCheckBox notQualifier[] = new JCheckBox[tracks.length];
    final JCheckBox showForward[] = new JCheckBox[tracks.length];
    final JCheckBox showReverse[] = new JCheckBox[tracks.length];
    final JCheckBox showAny[] = new JCheckBox[tracks.length];
    final TextFieldFloat trackSize[] = new TextFieldFloat[tracks.length];
    final TextFieldFloat trackPosition[] = new TextFieldFloat[tracks.length];
    
    c.anchor = GridBagConstraints.WEST;
    c.gridx = 0;
    c.gridy = 0;
    optionBox.add(new JLabel("Track"), c);
    c.gridx = 1;
    optionBox.add(new JLabel("Key"), c);
    c.gridx = 2;
    c.gridwidth = 4;
    optionBox.add(new JLabel("Qualifier"), c);
    c.gridx = 6;
    c.gridwidth = 1;
    optionBox.add(new JLabel("Strand"), c);
    c.gridx = 9;
    optionBox.add(new JLabel("Size"), c);
    c.gridx = 10;
    optionBox.add(new JLabel("Position"), c);
    
    for(int i = 0; i < tracks.length; i++)
    {
      final Track track = tracks[i];
      c.gridx = 0;
      c.gridy = i+1;
      c.anchor = GridBagConstraints.EAST;

      optionBox.add(new JLabel(Integer.toString(i+1)+" "+track.getEntry().getName()), c);

      c.gridx = 1;
      c.anchor = GridBagConstraints.WEST;
      
      final Key key;
      if(track.getKeyStr() != null)
        key = new Key(track.getKeyStr());
      else
        key = new Key("-");
      
      Entry entry = dnaDraw.getArtemisEntryGroup().getDefaultEntry();
      if(entry == null)
        entry = dnaDraw.getArtemisEntryGroup().getSequenceEntry();
      keyChoice[i] = new KeyChoice(
          entry.getEntryInformation(),key);

      optionBox.add(keyChoice[i], c);
      
      c.gridx = 2;
      notQualifier[i] = new JCheckBox("Not", !track.isNotQualifier());
      optionBox.add(notQualifier[i], c);
      
      c.gridx = 3;
      String qualifier = track.getQualifier();
      final int n = i;
      final JButton addQualifier = new JButton("ADD QUALIFIER");
      addQualifier.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
          c.gridx = 3;
          c.gridy = n+1;
          qualifierChoice[n] = new QualifierChoice(
              dnaDraw.getArtemisEntryGroup().getDefaultEntry().getEntryInformation(),key, null, false);
          optionBox.add(qualifierChoice[n], c);
          
          c.gridx = 4;
          qualifierValue[n] = new JTextField(track.getQualifierValue(), 10);
          optionBox.add(qualifierValue[n], c);
          
          optionBox.remove(addQualifier);
          optionBox.repaint();
          optionBox.revalidate();
        }
      });
      
      if(qualifier == null)
        optionBox.add(addQualifier, c);
      else
      {
        qualifierChoice[i] = new QualifierChoice(
            entry.getEntryInformation(),key, qualifier, false);
        optionBox.add(qualifierChoice[i], c);
        c.gridx = 4;
        qualifierValue[i] = new JTextField(track.getQualifierValue(), 10);
        optionBox.add(qualifierValue[i], c);
      }

      final JButton removeButton = new JButton("X");
      Font font = dnaDraw.getFont().deriveFont(Font.BOLD);
      removeButton.setFont(font);
      removeButton.setToolTipText("REMOVE QUALIFIER");
      c.gridx = 5;
      optionBox.add(removeButton, c);
      removeButton.setForeground(new Color(139,35,35));
      removeButton.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
          if(qualifierChoice[n] != null)
          {
            optionBox.remove(qualifierChoice[n]);
            optionBox.remove(qualifierValue[n]);
          }
          
          c.gridx = 3;
          c.gridy = n+1;
          optionBox.add(addQualifier, c);
          qualifierChoice[n] = null;
          optionBox.repaint();
          optionBox.revalidate();
        }
      });
      removeButton.setPreferredSize(new Dimension(35,
            removeButton.getPreferredSize().height));
      
      c.gridx = 6;
      showForward[i] = new JCheckBox("Forward", track.isShowForward());
      optionBox.add(showForward[i], c);
      
      c.gridx = 7;
      showReverse[i] = new JCheckBox("Reverse", track.isShowReverse());
      optionBox.add(showReverse[i], c);
      
      c.gridx = 8;
      showAny[i] = new JCheckBox("Any", track.isAny());
      optionBox.add(showAny[i], c);
      
      c.gridx = 9;
      trackSize[i] = new TextFieldFloat();
      trackSize[i].setValue(track.getSize());
      trackSize[i].setColumns(4);
      optionBox.add(trackSize[i], c);
      
      c.gridx = 10;
      trackPosition[i] = new TextFieldFloat();
      trackPosition[i].setValue(track.getPosition());
      trackPosition[i].setColumns(4);
      optionBox.add(trackPosition[i], c);
      
      
      c.gridx = 11;
      final JButton colourSelection = new JButton("COLOUR");
  
      colourSelection.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
          final JFrame frameColour = new JFrame("Track "+(n+1)+" Colour");
          GridBagLayout grid = new GridBagLayout();
          final GridBagConstraints c = new GridBagConstraints();
          c.ipady = 3;
          c.ipadx = 5;
          c.anchor = GridBagConstraints.WEST;
          
          final JPanel optionBox = new JPanel(grid);
          frameColour.getContentPane().add(optionBox);
          
          Color col = track.getColour();
          if(col == null)
            col = Color.red;
          
          final JButton colourButton = GeneticMarker.setUpColorButton(col);
          c.gridx = 0;
          c.gridy = 0;
          optionBox.add(colourButton,c);
             
          final JCheckBox colourQualifier = new JCheckBox("Use colour qualifier");
          if(track.getColour() == null)
            colourQualifier.setSelected(true);
          else
            colourQualifier.setSelected(false);
          
          colourQualifier.addItemListener(new ItemListener()
          {
            public void itemStateChanged(ItemEvent e)
            {
              if(colourQualifier.isSelected())
                track.setColour(null);
              else
                track.setColour(colourButton.getBackground());
              dnaDraw.repaint();
            }
          });
          
          final JButton ok = new JButton("Apply Colour to All");
          ok.addActionListener(new ActionListener()
          {
            public void actionPerformed(ActionEvent e)
            {
              track.setColour(colourButton.getBackground());
              colourQualifier.setSelected(false);
              dnaDraw.repaint();
            }
          });
          c.gridx = 1;
          c.gridy = 0;
          optionBox.add(ok,c);
          
          c.gridx = 1;
          c.gridy = 1;
          optionBox.add(colourQualifier, c);
          
          c.gridx = 1;
          c.gridy = 2;
          final JButton close = new JButton("Close");
          close.addActionListener(new ActionListener()
          {
            public void actionPerformed(ActionEvent e)
            {
              frameColour.dispose();
            }
          });
          optionBox.add(close,c);
          
          frameColour.pack();
          frameColour.setVisible(true);
        }
      });
      optionBox.add(colourSelection, c);
    }
    
    c.gridx = 0;
    c.gridy = tracks.length+1;
    c.gridwidth = 2;
    
    JButton updateButton = new JButton("UPDATE TRACKS");
    optionBox.add(updateButton,c);
    updateButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        
        // update tracks
        for(int i=0; i<tracks.length; i++)
        {
          if(keyChoice[i].getSelectedItem().getKeyString().equals("-"))
          {
            tracks[i].setFeaturePredicate(null);
            tracks[i].setAny(showAny[i].isSelected());
            tracks[i].setKeyStr("-");
          }
          else
          {
            tracks[i].setKeyStr(keyChoice[i].getSelectedItem().getKeyString());
            if(qualifierChoice[i] == null)
            {
              tracks[i].setFeaturePredicate(new FeatureKeyPredicate(keyChoice[i].getSelectedItem()));
              tracks[i].setQualifier(null);
            }
            else
            {
              if(qualifierValue[i].getText().trim().equals(""))
              {
                tracks[i].setFeaturePredicate(
                    new FeatureKeyQualifierPredicate(keyChoice[i].getSelectedItem(),
                      (String)qualifierChoice[i].getSelectedItem(), !notQualifier[i].isSelected()));
              }
              else
              {
                
                final FeaturePredicateVector temp_predicates =
                  new FeaturePredicateVector();

                //final StringVector words =
                //  StringVector.getStrings(search_text, " ");
                
                final StringTokenizer tok = new StringTokenizer(qualifierValue[i].getText(), " \n");

                while(tok.hasMoreTokens()) 
                {
                  final String this_word = tok.nextToken().trim();
                  final FeaturePredicate new_predicate =
                    new FeatureKeyQualifierPredicate(keyChoice[i].getSelectedItem(),
                                                     (String)qualifierChoice[i].getSelectedItem(),
                                                     this_word,
                                                     false,
                                                     true);

                  temp_predicates.add(new_predicate);
                }

                FeaturePredicateConjunction key_and_qualifier_predicate =
                  new FeaturePredicateConjunction(temp_predicates,
                                                  FeaturePredicateConjunction.OR);
                
                
                tracks[i].setFeaturePredicate(key_and_qualifier_predicate);
              }
              tracks[i].setQualifier((String)qualifierChoice[i].getSelectedItem());
              tracks[i].setQualifierValue(qualifierValue[i].getText());
            }
            tracks[i].setAny(false);
          }
          tracks[i].setShowForward(showForward[i].isSelected());
          tracks[i].setShowReverse(showReverse[i].isSelected());
          tracks[i].setSize((float) trackSize[i].getValue());
          tracks[i].setPosition(trackPosition[i].getValue());
        }
        
        // update viewer
        dnaDraw.getBlock().removeAll(dnaDraw.getBlock());
        final FeatureVector features = dnaDraw.getArtemisEntryGroup().getAllFeatures();
        
        
        for(int i=0; i<features.size(); i++)
        {   
          Feature f = features.elementAt(i);
          Vector myTracks = new Vector();
          
          for(int j=0; j<tracks.length; j++)
          {
            if(tracks[j].isOnTrack(f))
              myTracks.add(tracks[j]);
          }
          
          if(myTracks.size() < 1)
            continue;
          
          Color col = f.getColour();
          if(col == null || col.equals(Color.white))
            col = Color.lightGray;
          
          RangeVector ranges = f.getLocation().getRanges();
          
          for(int j=0; j<ranges.size(); j++)
          {
            Range range = (Range) ranges.get(j);    
   
            for(int k=0; k<myTracks.size(); k++)
            {
              Track myTrack = (Track)myTracks.get(k);
              Block drawBlock = new Block(f.getIDString(), 
                range.getStart(),
                range.getEnd(), 
                col, 
                myTrack.getSize(), 
                myTrack, dnaDraw);
          
              drawBlock.setFeature(f);
              dnaDraw.getBlock().add(drawBlock);
            }
          }
        }
        
        dnaDraw.repaint();
      }
    });
    
    c.gridx = 2;
    c.gridy = tracks.length+1;
    c.gridwidth = 2;
    
    JButton addTrackButton = new JButton("ADD TRACK");
    optionBox.add(addTrackButton,c);
    addTrackButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        Wizard.addTrack( Wizard.getTracks()[0].getEntry() );
        getContentPane().removeAll();
        getContentPane().add(getPanelComponents());
        pack();
        setVisible(true);
      }
    });
    
    return optionBox;
  }

}

