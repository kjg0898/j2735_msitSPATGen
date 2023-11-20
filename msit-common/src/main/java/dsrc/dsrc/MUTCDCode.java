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
 * Define the ASN1 Type MUTCDCode from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class MUTCDCode extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MUTCDCode()
    {
	super(cFirstNumber);
    }
    
    protected MUTCDCode(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long none = 0;
	public static final long regulatory = 1;
	public static final long warning = 2;
	public static final long maintenance = 3;
	public static final long motoristService = 4;
	public static final long guide = 5;
	public static final long rec = 6;
	
    }
    // Named list definitions.
    private final static MUTCDCode cNamedNumbers[] = {
	new MUTCDCode(), 
	new MUTCDCode(1), 
	new MUTCDCode(2), 
	new MUTCDCode(3), 
	new MUTCDCode(4), 
	new MUTCDCode(5), 
	new MUTCDCode(6)
    };
    public static final MUTCDCode none = cNamedNumbers[0];
    public static final MUTCDCode regulatory = cNamedNumbers[1];
    public static final MUTCDCode warning = cNamedNumbers[2];
    public static final MUTCDCode maintenance = cNamedNumbers[3];
    public static final MUTCDCode motoristService = cNamedNumbers[4];
    public static final MUTCDCode guide = cNamedNumbers[5];
    public static final MUTCDCode rec = cNamedNumbers[6];
    
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
	if (value >= 0 && value <= 6)
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
    
    public static MUTCDCode valueOf(long value)
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
	    "MUTCDCode"
	),
	new QName (
	    "DSRC",
	    "MUTCDCode"
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
		    "regulatory",
		    1
		),
		new MemberListElement (
		    "warning",
		    2
		),
		new MemberListElement (
		    "maintenance",
		    3
		),
		new MemberListElement (
		    "motoristService",
		    4
		),
		new MemberListElement (
		    "guide",
		    5
		),
		new MemberListElement (
		    "rec",
		    6
		)
	    }
	),
	0,
	none
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MUTCDCode object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MUTCDCode object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Methods for "unknownEnumerator"
     */
    private static final MUTCDCode cUnknownEnumerator = 
	new MUTCDCode(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    public Enumerated getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for MUTCDCode
