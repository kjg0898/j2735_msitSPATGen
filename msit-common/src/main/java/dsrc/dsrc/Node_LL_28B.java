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

import com.oss.asn1.AbstractData;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Node_LL_28B from ASN1 Module DSRC.
 * @see Sequence
 */

public class Node_LL_28B extends Sequence {
    
    /**
     * The default constructor.
     */
    public Node_LL_28B()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Node_LL_28B(OffsetLL_B14 lon, OffsetLL_B14 lat)
    {
	setLon(lon);
	setLat(lat);
    }
    
    public void initComponents()
    {
	mComponents[0] = new OffsetLL_B14();
	mComponents[1] = new OffsetLL_B14();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new OffsetLL_B14();
	    case 1:
		return new OffsetLL_B14();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "lon"
    public OffsetLL_B14 getLon()
    {
	return (OffsetLL_B14)mComponents[0];
    }
    
    public void setLon(OffsetLL_B14 lon)
    {
	mComponents[0] = lon;
    }
    
    
    // Methods for field "lat"
    public OffsetLL_B14 getLat()
    {
	return (OffsetLL_B14)mComponents[1];
    }
    
    public void setLat(OffsetLL_B14 lat)
    {
	mComponents[1] = lat;
    }
    
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "dsrc.dsrc",
	    "Node_LL_28B"
	),
	new QName (
	    "DSRC",
	    "Node-LL-28B"
	),
	274450,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"OffsetLL_B14"
			    ),
			    new QName (
				"DSRC",
				"OffsetLL-B14"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new OffsetLL_B14(-8192), 
				    new OffsetLL_B14(8191),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-8192),
				Long.valueOf(8191)
			    ),
			    null
			)
		    ),
		    "lon",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"OffsetLL_B14"
			    ),
			    new QName (
				"DSRC",
				"OffsetLL-B14"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new OffsetLL_B14(-8192), 
				    new OffsetLL_B14(8191),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-8192),
				Long.valueOf(8191)
			    ),
			    null
			)
		    ),
		    "lat",
		    1,
		    2,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Node_LL_28B object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Node_LL_28B object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Node_LL_28B
