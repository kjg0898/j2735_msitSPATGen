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

import com.oss.asn1.Enumerated;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type VehicleType from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class VehicleType extends Enumerated {
    
    /**
     * The default constructor.
     */
    private VehicleType()
    {
	super(cFirstNumber);
    }
    
    protected VehicleType(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long none = 0;
	public static final long unknown = 1;
	public static final long special = 2;
	public static final long moto = 3;
	public static final long car = 4;
	public static final long carOther = 5;
	public static final long bus = 6;
	public static final long axleCnt2 = 7;
	public static final long axleCnt3 = 8;
	public static final long axleCnt4 = 9;
	public static final long axleCnt4Trailer = 10;
	public static final long axleCnt5Trailer = 11;
	public static final long axleCnt6Trailer = 12;
	public static final long axleCnt5MultiTrailer = 13;
	public static final long axleCnt6MultiTrailer = 14;
	public static final long axleCnt7MultiTrailer = 15;
	
    }
    // Named list definitions.
    private final static VehicleType cNamedNumbers[] = {
	new VehicleType(), 
	new VehicleType(1), 
	new VehicleType(2), 
	new VehicleType(3), 
	new VehicleType(4), 
	new VehicleType(5), 
	new VehicleType(6), 
	new VehicleType(7), 
	new VehicleType(8), 
	new VehicleType(9), 
	new VehicleType(10), 
	new VehicleType(11), 
	new VehicleType(12), 
	new VehicleType(13), 
	new VehicleType(14), 
	new VehicleType(15)
    };
    public static final VehicleType none = cNamedNumbers[0];
    public static final VehicleType unknown = cNamedNumbers[1];
    public static final VehicleType special = cNamedNumbers[2];
    public static final VehicleType moto = cNamedNumbers[3];
    public static final VehicleType car = cNamedNumbers[4];
    public static final VehicleType carOther = cNamedNumbers[5];
    public static final VehicleType bus = cNamedNumbers[6];
    public static final VehicleType axleCnt2 = cNamedNumbers[7];
    public static final VehicleType axleCnt3 = cNamedNumbers[8];
    public static final VehicleType axleCnt4 = cNamedNumbers[9];
    public static final VehicleType axleCnt4Trailer = cNamedNumbers[10];
    public static final VehicleType axleCnt5Trailer = cNamedNumbers[11];
    public static final VehicleType axleCnt6Trailer = cNamedNumbers[12];
    public static final VehicleType axleCnt5MultiTrailer = cNamedNumbers[13];
    public static final VehicleType axleCnt6MultiTrailer = cNamedNumbers[14];
    public static final VehicleType axleCnt7MultiTrailer = cNamedNumbers[15];
    
    protected final static long cFirstNumber = 0;
    protected final static boolean cLinearNumbers = false;
    
    public Enumerated[] getNamedNumbers()
    {
	return cNamedNumbers;
    }
    
    public boolean hasLinearNumbers()
    {
	return cLinearNumbers;
    }
    
    public long getFirstNumber()
    {
	return cFirstNumber;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 15)
	    return (int)value;
	else
	    return -1;
    }
    
    /**
     * Returns the enumerator with the specified value or null if the value
     * is not associated with any enumerator.
     *  @param value The value of the enumerator to return.
     *  @return The enumerator with the specified value.
     */
    
    public static VehicleType valueOf(long value)
    {
	int inx = indexOfValue(value);
	
	if (inx < 0)
	    return null;
	else
	    return cNamedNumbers[inx];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int indexOf()
    {
	if (isUnknownEnumerator())
	    return -1;
	return indexOfValue(mValue);
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public Enumerated lookupValue(long value)
    {
	return valueOf(value);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	new Tags (
	    new short[] {
		0x000a
	    }
	),
	new QName (
	    "dsrc.dsrc",
	    "VehicleType"
	),
	new QName (
	    "DSRC",
	    "VehicleType"
	),
	274454,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "none",
		    0
		),
		new MemberListElement (
		    "unknown",
		    1
		),
		new MemberListElement (
		    "special",
		    2
		),
		new MemberListElement (
		    "moto",
		    3
		),
		new MemberListElement (
		    "car",
		    4
		),
		new MemberListElement (
		    "carOther",
		    5
		),
		new MemberListElement (
		    "bus",
		    6
		),
		new MemberListElement (
		    "axleCnt2",
		    7
		),
		new MemberListElement (
		    "axleCnt3",
		    8
		),
		new MemberListElement (
		    "axleCnt4",
		    9
		),
		new MemberListElement (
		    "axleCnt4Trailer",
		    10
		),
		new MemberListElement (
		    "axleCnt5Trailer",
		    11
		),
		new MemberListElement (
		    "axleCnt6Trailer",
		    12
		),
		new MemberListElement (
		    "axleCnt5MultiTrailer",
		    13
		),
		new MemberListElement (
		    "axleCnt6MultiTrailer",
		    14
		),
		new MemberListElement (
		    "axleCnt7MultiTrailer",
		    15
		)
	    }
	),
	0,
	none
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' VehicleType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' VehicleType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Methods for "unknownEnumerator"
     */
    private static final VehicleType cUnknownEnumerator = 
	new VehicleType(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    public Enumerated getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for VehicleType
