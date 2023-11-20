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

import com.oss.asn1.INTEGER;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type OffsetLL_B12 from ASN1 Module DSRC.
 * @see INTEGER
 */

public class OffsetLL_B12 extends INTEGER {
    
    /**
     * The default constructor.
     */
    public OffsetLL_B12()
    {
    }
    
    public OffsetLL_B12(short value)
    {
	super(value);
    }
    
    public OffsetLL_B12(int value)
    {
	super(value);
    }
    
    public OffsetLL_B12(long value)
    {
	super(value);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final IntegerInfo c_typeinfo = new IntegerInfo (
	new Tags (
	    new short[] {
		0x0002
	    }
	),
	new QName (
	    "dsrc.dsrc",
	    "OffsetLL_B12"
	),
	new QName (
	    "DSRC",
	    "OffsetLL-B12"
	),
	274450,
	new ValueRangeConstraint (
	    new AbstractBounds(
		new OffsetLL_B12(-2048), 
		new OffsetLL_B12(2047),
		0
	    )
	),
	new Bounds (
	    Long.valueOf(-2048),
	    Long.valueOf(2047)
	),
	null
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' OffsetLL_B12 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' OffsetLL_B12 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for OffsetLL_B12
