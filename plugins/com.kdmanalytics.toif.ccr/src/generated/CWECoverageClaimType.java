/*******************************************************************************
 * Copyright (c) 2016 KDM Analytics, Inc. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Open Source
 * Initiative OSI - Open Software License v3.0 which accompanies this
 * distribution, and is available at http://www.opensource.org/licenses/osl-3.0.php/
 ******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2012.03.30 at 02:17:16 PM EDT
//

package generated;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for CWE_Coverage_ClaimType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CWE_Coverage_ClaimType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Claims">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Claim" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CWE_Claim_Comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Rule_Set" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Rule" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Rule_Comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Rule_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Rule_Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Match_Accuracy" use="required" type="{}Match_Accuracy_Type" />
 *                           &lt;attribute name="CWE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="CWE_Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CWE_Version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Vendor_Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Toolset_Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Toolset_Version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Info_URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Date_of_Claim" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Language_Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Source Code"/>
 *             &lt;enumeration value="Byte Code"/>
 *             &lt;enumeration value="Binary Code"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CWE_Coverage_ClaimType", propOrder = {
                                                        "claims", "comments"
})
public class CWECoverageClaimType {
  
  /**
   * <p>
   * Java class for anonymous complex type.
   * 
   * <p>
   * The following schema fragment specifies the expected content contained within this class.
   * 
   * <pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *       &lt;sequence>
   *         &lt;element name="Claim" maxOccurs="unbounded">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="CWE_Claim_Comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="Rule_Set" minOccurs="0">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="Rule" maxOccurs="unbounded">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                     &lt;sequence>
   *                                       &lt;element name="Rule_Comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                     &lt;/sequence>
   *                                     &lt;attribute name="Rule_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                     &lt;attribute name="Rule_Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                   &lt;/restriction>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                 &lt;/sequence>
   *                 &lt;attribute name="Match_Accuracy" use="required" type="{}Match_Accuracy_Type" />
   *                 &lt;attribute name="CWE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                 &lt;attribute name="CWE_Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   * 
   * 
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
                                    "claim"
  })
  public static class Claims {
    
    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CWE_Claim_Comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Rule_Set" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Rule" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Rule_Comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Rule_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Rule_Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Match_Accuracy" use="required" type="{}Match_Accuracy_Type" />
     *       &lt;attribute name="CWE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CWE_Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
                                      "cweClaimComments", "ruleSet"
    })
    public static class Claim {
      
      /**
       * <p>
       * Java class for anonymous complex type.
       * 
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       * 
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="Rule" maxOccurs="unbounded">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                 &lt;sequence>
       *                   &lt;element name="Rule_Comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                 &lt;/sequence>
       *                 &lt;attribute name="Rule_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
       *                 &lt;attribute name="Rule_Name" type="{http://www.w3.org/2001/XMLSchema}string" />
       *               &lt;/restriction>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       * 
       * 
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {
                                        "rule"
      })
      public static class RuleSet {
        
        /**
         * <p>
         * Java class for anonymous complex type.
         * 
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Rule_Comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="Rule_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Rule_Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                                          "ruleComments"
        })
        public static class Rule {
          
          @XmlElement(name = "Rule_Comments", required = true)
          protected String ruleComments;
          
          @XmlAttribute(name = "Rule_ID")
          protected String ruleID;
          
          @XmlAttribute(name = "Rule_Name")
          protected String ruleName;
          
          /**
           * Gets the value of the ruleComments property.
           * 
           * @return possible object is {@link String }
           *         
           */
          public String getRuleComments() {
            return ruleComments;
          }
          
          /**
           * Gets the value of the ruleID property.
           * 
           * @return possible object is {@link String }
           *         
           */
          public String getRuleID() {
            return ruleID;
          }
          
          /**
           * Gets the value of the ruleName property.
           * 
           * @return possible object is {@link String }
           *         
           */
          public String getRuleName() {
            return ruleName;
          }
          
          /**
           * Sets the value of the ruleComments property.
           * 
           * @param value
           *          allowed object is {@link String }
           *          
           */
          public void setRuleComments(String value) {
            this.ruleComments = value;
          }
          
          /**
           * Sets the value of the ruleID property.
           * 
           * @param value
           *          allowed object is {@link String }
           *          
           */
          public void setRuleID(String value) {
            this.ruleID = value;
          }
          
          /**
           * Sets the value of the ruleName property.
           * 
           * @param value
           *          allowed object is {@link String }
           *          
           */
          public void setRuleName(String value) {
            this.ruleName = value;
          }
          
        }
        
        @XmlElement(name = "Rule", required = true)
        protected List<CWECoverageClaimType.Claims.Claim.RuleSet.Rule> rule;
        
        /**
         * Gets the value of the rule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any
         * modification you make to the returned list will be present inside the JAXB object. This
         * is why there is not a <CODE>set</CODE> method for the rule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CWECoverageClaimType.Claims.Claim.RuleSet.Rule }
         * 
         * 
         */
        public List<CWECoverageClaimType.Claims.Claim.RuleSet.Rule> getRule() {
          if (rule == null) {
            rule = new ArrayList<CWECoverageClaimType.Claims.Claim.RuleSet.Rule>();
          }
          return this.rule;
        }
        
      }
      
      @XmlElement(name = "CWE_Claim_Comments", required = true)
      protected String cweClaimComments;
      
      @XmlElement(name = "Rule_Set")
      protected CWECoverageClaimType.Claims.Claim.RuleSet ruleSet;
      
      @XmlAttribute(name = "Match_Accuracy", required = true)
      protected MatchAccuracyType matchAccuracy;
      
      @XmlAttribute(name = "CWE_ID")
      protected String cweid;
      
      @XmlAttribute(name = "CWE_Name")
      protected String cweName;
      
      /**
       * Gets the value of the cweClaimComments property.
       * 
       * @return possible object is {@link String }
       *         
       */
      public String getCWEClaimComments() {
        return cweClaimComments;
      }
      
      /**
       * Gets the value of the cweid property.
       * 
       * @return possible object is {@link String }
       *         
       */
      public String getCWEID() {
        return cweid;
      }
      
      /**
       * Gets the value of the cweName property.
       * 
       * @return possible object is {@link String }
       *         
       */
      public String getCWEName() {
        return cweName;
      }
      
      /**
       * Gets the value of the matchAccuracy property.
       * 
       * @return possible object is {@link MatchAccuracyType }
       *         
       */
      public MatchAccuracyType getMatchAccuracy() {
        return matchAccuracy;
      }
      
      /**
       * Gets the value of the ruleSet property.
       * 
       * @return possible object is {@link CWECoverageClaimType.Claims.Claim.RuleSet }
       *         
       */
      public CWECoverageClaimType.Claims.Claim.RuleSet getRuleSet() {
        return ruleSet;
      }
      
      /**
       * Sets the value of the cweClaimComments property.
       * 
       * @param value
       *          allowed object is {@link String }
       *          
       */
      public void setCWEClaimComments(String value) {
        this.cweClaimComments = value;
      }
      
      /**
       * Sets the value of the cweid property.
       * 
       * @param value
       *          allowed object is {@link String }
       *          
       */
      public void setCWEID(String value) {
        this.cweid = value;
      }
      
      /**
       * Sets the value of the cweName property.
       * 
       * @param value
       *          allowed object is {@link String }
       *          
       */
      public void setCWEName(String value) {
        this.cweName = value;
      }
      
      /**
       * Sets the value of the matchAccuracy property.
       * 
       * @param value
       *          allowed object is {@link MatchAccuracyType }
       *          
       */
      public void setMatchAccuracy(MatchAccuracyType value) {
        this.matchAccuracy = value;
      }
      
      /**
       * Sets the value of the ruleSet property.
       * 
       * @param value
       *          allowed object is {@link CWECoverageClaimType.Claims.Claim.RuleSet }
       *          
       */
      public void setRuleSet(CWECoverageClaimType.Claims.Claim.RuleSet value) {
        this.ruleSet = value;
      }
      
    }
    
    @XmlElement(name = "Claim", required = true)
    protected List<CWECoverageClaimType.Claims.Claim> claim;
    
    /**
     * Gets the value of the claim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the claim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getClaim().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CWECoverageClaimType.Claims.Claim }
     * 
     * 
     */
    public List<CWECoverageClaimType.Claims.Claim> getClaim() {
      if (claim == null) {
        claim = new ArrayList<CWECoverageClaimType.Claims.Claim>();
      }
      return this.claim;
    }
    
  }
  
  @XmlElement(name = "Claims", required = true)
  protected CWECoverageClaimType.Claims claims;
  
  @XmlElement(name = "Comments")
  protected String comments;
  
  @XmlAttribute(name = "CWE_Version")
  protected String cweVersion;
  
  @XmlAttribute(name = "Vendor_Name")
  protected String vendorName;
  
  @XmlAttribute(name = "Toolset_Name")
  protected String toolsetName;
  
  @XmlAttribute(name = "Toolset_Version")
  protected String toolsetVersion;
  
  @XmlAttribute(name = "Info_URL")
  @XmlSchemaType(name = "anyURI")
  protected String infoURL;
  
  @XmlAttribute(name = "Date_of_Claim")
  @XmlSchemaType(name = "date")
  protected XMLGregorianCalendar dateOfClaim;
  
  @XmlAttribute(name = "Language_Type")
  protected String languageType;
  
  @XmlAttribute(name = "Language")
  protected String language;
  
  /**
   * Gets the value of the claims property.
   * 
   * @return possible object is {@link CWECoverageClaimType.Claims }
   *         
   */
  public CWECoverageClaimType.Claims getClaims() {
    return claims;
  }
  
  /**
   * Gets the value of the comments property.
   * 
   * @return possible object is {@link String }
   *         
   */
  public String getComments() {
    return comments;
  }
  
  /**
   * Gets the value of the cweVersion property.
   * 
   * @return possible object is {@link String }
   *         
   */
  public String getCWEVersion() {
    return cweVersion;
  }
  
  /**
   * Gets the value of the dateOfClaim property.
   * 
   * @return possible object is {@link XMLGregorianCalendar }
   *         
   */
  public XMLGregorianCalendar getDateOfClaim() {
    return dateOfClaim;
  }
  
  /**
   * Gets the value of the infoURL property.
   * 
   * @return possible object is {@link String }
   *         
   */
  public String getInfoURL() {
    return infoURL;
  }
  
  /**
   * Gets the value of the language property.
   * 
   * @return possible object is {@link String }
   *         
   */
  public String getLanguage() {
    return language;
  }
  
  /**
   * Gets the value of the languageType property.
   * 
   * @return possible object is {@link String }
   *         
   */
  public String getLanguageType() {
    return languageType;
  }
  
  /**
   * Gets the value of the toolsetName property.
   * 
   * @return possible object is {@link String }
   *         
   */
  public String getToolsetName() {
    return toolsetName;
  }
  
  /**
   * Gets the value of the toolsetVersion property.
   * 
   * @return possible object is {@link String }
   *         
   */
  public String getToolsetVersion() {
    return toolsetVersion;
  }
  
  /**
   * Gets the value of the vendorName property.
   * 
   * @return possible object is {@link String }
   *         
   */
  public String getVendorName() {
    return vendorName;
  }
  
  /**
   * Sets the value of the claims property.
   * 
   * @param value
   *          allowed object is {@link CWECoverageClaimType.Claims }
   *          
   */
  public void setClaims(CWECoverageClaimType.Claims value) {
    this.claims = value;
  }
  
  /**
   * Sets the value of the comments property.
   * 
   * @param value
   *          allowed object is {@link String }
   *          
   */
  public void setComments(String value) {
    this.comments = value;
  }
  
  /**
   * Sets the value of the cweVersion property.
   * 
   * @param value
   *          allowed object is {@link String }
   *          
   */
  public void setCWEVersion(String value) {
    this.cweVersion = value;
  }
  
  /**
   * Sets the value of the dateOfClaim property.
   * 
   * @param value
   *          allowed object is {@link XMLGregorianCalendar }
   *          
   */
  public void setDateOfClaim(XMLGregorianCalendar value) {
    this.dateOfClaim = value;
  }
  
  /**
   * Sets the value of the infoURL property.
   * 
   * @param value
   *          allowed object is {@link String }
   *          
   */
  public void setInfoURL(String value) {
    this.infoURL = value;
  }
  
  /**
   * Sets the value of the language property.
   * 
   * @param value
   *          allowed object is {@link String }
   *          
   */
  public void setLanguage(String value) {
    this.language = value;
  }
  
  /**
   * Sets the value of the languageType property.
   * 
   * @param value
   *          allowed object is {@link String }
   *          
   */
  public void setLanguageType(String value) {
    this.languageType = value;
  }
  
  /**
   * Sets the value of the toolsetName property.
   * 
   * @param value
   *          allowed object is {@link String }
   *          
   */
  public void setToolsetName(String value) {
    this.toolsetName = value;
  }
  
  /**
   * Sets the value of the toolsetVersion property.
   * 
   * @param value
   *          allowed object is {@link String }
   *          
   */
  public void setToolsetVersion(String value) {
    this.toolsetVersion = value;
  }
  
  /**
   * Sets the value of the vendorName property.
   * 
   * @param value
   *          allowed object is {@link String }
   *          
   */
  public void setVendorName(String value) {
    this.vendorName = value;
  }
  
}
