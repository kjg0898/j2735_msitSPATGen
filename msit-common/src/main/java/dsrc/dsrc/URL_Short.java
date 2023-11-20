/*************************************************************/
/* Copyright (C) 2023 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Neighbor System, Site-based, License 17353 17353,
 * at 16th Fl. IT Venture Tower (East), 135, Jungdae-ro, Songpa-Gu, Seoul 05717, Korea. */
/* Abstract syntax: j2735_cits_20201125 */
/* ASN.1 Java project: dsrc.Dsrc */
/* Created: Wed Jul 12 11:40:42 2023 */
/* ASN.1 Compiler for Java version: 7.2 */
/* ASN.1 compiler options and file names specified:
 * -output dsrc -nouniquepdu -per -uper -ber -der -cer -json -root
 * -pdusforopentypes -messageFormat msvc
 * D:/OSS_ASN1/Project/POLICE/J2735_CITS_20201125.asn
 * C:/Users/Administrator/AppData/Local/Temp/2/asn1studio.Administrator.9592/ossSamplePOLICE/J2735_CITS_20201125.asn
 */


package dsrc.dsrc;

import com.oss.asn1.IA5String;
import com.oss.asn1.INTEGER;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type URL_Short from ASN1 Module DSRC.
 * @see IA5String
 */

public class URL_Short extends IA5String {
    
    /**
     * The default constructor.
     */
    public URL_Short()
    {
    }
    
    /**
     * Construct from a String type.
     * @param value the String to set this object to.
     */
    public URL_Short(String value)
    {
	super(value);
    }
    
    
    /**
     * Construct from a char[] type.
     * @param value the char[] to set this object to.
     */
    public URL_Short(char[] value)
    {
	super(value);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final KMCStringInfo c_typeinfo = new KMCStringInfo (
	new Tags (
	    new short[] {
		0x0016
	    }
	),
	new QName (
	    "dsrc.dsrc",
	    "URL_Short"
	),
	new QName (
	    "DSRC",
	    "URL-Short"
	),
	274450,
	new Intersection (
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new INTEGER(1),
			new INTEGER(15),
			0
		    )
		)
	    ),
	    new PermittedAlphabetConstraint (
		IA5StringPAInfo.pa
	    )
	),
	new Bounds (
	    Long.valueOf(1),
	    Long.valueOf(15)
	),
	IA5StringPAInfo.paInfo
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' URL_Short object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' URL_Short object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for URL_Short
