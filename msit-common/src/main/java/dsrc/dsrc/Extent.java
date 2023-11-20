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
 * Define the ASN1 Type Extent from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class Extent extends Enumerated {
    
    /**
     * The default constructor.
     */
    private Extent()
    {
	super(cFirstNumber);
    }
    
    protected Extent(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long useInstantlyOnly = 0;
	public static final long useFor3meters = 1;
	public static final long useFor10meters = 2;
	public static final long useFor50meters = 3;
	public static final long useFor100meters = 4;
	public static final long useFor500meters = 5;
	public static final long useFor1000meters = 6;
	public static final long useFor5000meters = 7;
	public static final long useFor10000meters = 8;
	public static final long useFor50000meters = 9;
	public static final long useFor100000meters = 10;
	public static final long useFor500000meters = 11;
	public static final long useFor1000000meters = 12;
	public static final long useFor5000000meters = 13;
	public static final long useFor10000000meters = 14;
	public static final long forever = 15;
    }
    // Named list definitions.
    private final static Extent cNamedNumbers[] = {
	new Extent(), 
	new Extent(1), 
	new Extent(2), 
	new Extent(3), 
	new Extent(4), 
	new Extent(5), 
	new Extent(6), 
	new Extent(7), 
	new Extent(8), 
	new Extent(9), 
	new Extent(10), 
	new Extent(11), 
	new Extent(12), 
	new Extent(13), 
	new Extent(14), 
	new Extent(15)
    };
    public static final Extent useInstantlyOnly = cNamedNumbers[0];
    public static final Extent useFor3meters = cNamedNumbers[1];
    public static final Extent useFor10meters = cNamedNumbers[2];
    public static final Extent useFor50meters = cNamedNumbers[3];
    public static final Extent useFor100meters = cNamedNumbers[4];
    public static final Extent useFor500meters = cNamedNumbers[5];
    public static final Extent useFor1000meters = cNamedNumbers[6];
    public static final Extent useFor5000meters = cNamedNumbers[7];
    public static final Extent useFor10000meters = cNamedNumbers[8];
    public static final Extent useFor50000meters = cNamedNumbers[9];
    public static final Extent useFor100000meters = cNamedNumbers[10];
    public static final Extent useFor500000meters = cNamedNumbers[11];
    public static final Extent useFor1000000meters = cNamedNumbers[12];
    public static final Extent useFor5000000meters = cNamedNumbers[13];
    public static final Extent useFor10000000meters = cNamedNumbers[14];
    public static final Extent forever = cNamedNumbers[15];
    
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
    
    public static Extent valueOf(long value)
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
	    "Extent"
	),
	new QName (
	    "DSRC",
	    "Extent"
	),
	274450,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "useInstantlyOnly",
		    0
		),
		new MemberListElement (
		    "useFor3meters",
		    1
		),
		new MemberListElement (
		    "useFor10meters",
		    2
		),
		new MemberListElement (
		    "useFor50meters",
		    3
		),
		new MemberListElement (
		    "useFor100meters",
		    4
		),
		new MemberListElement (
		    "useFor500meters",
		    5
		),
		new MemberListElement (
		    "useFor1000meters",
		    6
		),
		new MemberListElement (
		    "useFor5000meters",
		    7
		),
		new MemberListElement (
		    "useFor10000meters",
		    8
		),
		new MemberListElement (
		    "useFor50000meters",
		    9
		),
		new MemberListElement (
		    "useFor100000meters",
		    10
		),
		new MemberListElement (
		    "useFor500000meters",
		    11
		),
		new MemberListElement (
		    "useFor1000000meters",
		    12
		),
		new MemberListElement (
		    "useFor5000000meters",
		    13
		),
		new MemberListElement (
		    "useFor10000000meters",
		    14
		),
		new MemberListElement (
		    "forever",
		    15
		)
	    }
	),
	0,
	useInstantlyOnly
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Extent object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Extent object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Extent
