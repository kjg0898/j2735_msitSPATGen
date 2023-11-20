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
 * Define the ASN1 Type Location_quality from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class Location_quality extends Enumerated {
    
    /**
     * The default constructor.
     */
    private Location_quality()
    {
	super(cFirstNumber);
    }
    
    protected Location_quality(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long loc_qual_bt1m = 0;
	public static final long loc_qual_bt5m = 1;
	public static final long loc_qual_bt12m = 2;
	public static final long loc_qual_bt50m = 3;
	public static final long loc_qual_bt125m = 4;
	public static final long loc_qual_bt500m = 5;
	public static final long loc_qual_bt1250m = 6;
	public static final long loc_qual_unknown = 7;
    }
    // Named list definitions.
    private final static Location_quality cNamedNumbers[] = {
	new Location_quality(), 
	new Location_quality(1), 
	new Location_quality(2), 
	new Location_quality(3), 
	new Location_quality(4), 
	new Location_quality(5), 
	new Location_quality(6), 
	new Location_quality(7)
    };
    public static final Location_quality loc_qual_bt1m = cNamedNumbers[0];
    public static final Location_quality loc_qual_bt5m = cNamedNumbers[1];
    public static final Location_quality loc_qual_bt12m = cNamedNumbers[2];
    public static final Location_quality loc_qual_bt50m = cNamedNumbers[3];
    public static final Location_quality loc_qual_bt125m = cNamedNumbers[4];
    public static final Location_quality loc_qual_bt500m = cNamedNumbers[5];
    public static final Location_quality loc_qual_bt1250m = cNamedNumbers[6];
    public static final Location_quality loc_qual_unknown = cNamedNumbers[7];
    
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
	if (value >= 0 && value <= 7)
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
    
    public static Location_quality valueOf(long value)
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
	    "Location_quality"
	),
	new QName (
	    "DSRC",
	    "Location-quality"
	),
	274450,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "loc-qual-bt1m",
		    0
		),
		new MemberListElement (
		    "loc-qual-bt5m",
		    1
		),
		new MemberListElement (
		    "loc-qual-bt12m",
		    2
		),
		new MemberListElement (
		    "loc-qual-bt50m",
		    3
		),
		new MemberListElement (
		    "loc-qual-bt125m",
		    4
		),
		new MemberListElement (
		    "loc-qual-bt500m",
		    5
		),
		new MemberListElement (
		    "loc-qual-bt1250m",
		    6
		),
		new MemberListElement (
		    "loc-qual-unknown",
		    7
		)
	    }
	),
	0,
	loc_qual_bt1m
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Location_quality object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Location_quality object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for Location_quality
