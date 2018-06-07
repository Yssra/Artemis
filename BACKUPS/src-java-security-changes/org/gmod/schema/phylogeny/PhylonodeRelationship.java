package org.gmod.schema.phylogeny;
// Generated Aug 31, 2006 4:02:18 PM by Hibernate Tools 3.2.0.beta7


import org.gmod.schema.cv.CvTerm;










/**
 * PhylonodeRelationship generated by hbm2java
 */


public class PhylonodeRelationship  implements java.io.Serializable {

    // Fields    

     private int phylonodeRelationshipId;
     private Phylonode phylonodeBySubjectId;
     private Phylonode phylonodeByObjectId;
     private CvTerm cvTerm;
     private Integer rank;

     // Constructors

    /** default constructor */
    public PhylonodeRelationship() {
    	// Deliberately empty default constructor
    }

	/** minimal constructor */
    public PhylonodeRelationship(int phylonodeRelationshipId, Phylonode phylonodeBySubjectId, Phylonode phylonodeByObjectId, CvTerm cvTerm) {
        this.phylonodeRelationshipId = phylonodeRelationshipId;
        this.phylonodeBySubjectId = phylonodeBySubjectId;
        this.phylonodeByObjectId = phylonodeByObjectId;
        this.cvTerm = cvTerm;
    }
    /** full constructor */
    public PhylonodeRelationship(int phylonodeRelationshipId, Phylonode phylonodeBySubjectId, Phylonode phylonodeByObjectId, CvTerm cvTerm, Integer rank) {
       this.phylonodeRelationshipId = phylonodeRelationshipId;
       this.phylonodeBySubjectId = phylonodeBySubjectId;
       this.phylonodeByObjectId = phylonodeByObjectId;
       this.cvTerm = cvTerm;
       this.rank = rank;
    }
   
    // Property accessors

    

    public int getPhylonodeRelationshipId() {
        return this.phylonodeRelationshipId;
    }
    
    public void setPhylonodeRelationshipId(int phylonodeRelationshipId) {
        this.phylonodeRelationshipId = phylonodeRelationshipId;
    }

    

    public Phylonode getPhylonodeBySubjectId() {
        return this.phylonodeBySubjectId;
    }
    
    public void setPhylonodeBySubjectId(Phylonode phylonodeBySubjectId) {
        this.phylonodeBySubjectId = phylonodeBySubjectId;
    }

    

    public Phylonode getPhylonodeByObjectId() {
        return this.phylonodeByObjectId;
    }
    
    public void setPhylonodeByObjectId(Phylonode phylonodeByObjectId) {
        this.phylonodeByObjectId = phylonodeByObjectId;
    }

    

    public CvTerm getCvTerm() {
        return this.cvTerm;
    }
    
    public void setCvTerm(CvTerm cvTerm) {
        this.cvTerm = cvTerm;
    }
    

    public Integer getRank() {
        return this.rank;
    }
    
    public void setRank(Integer rank) {
        this.rank = rank;
    }




}


