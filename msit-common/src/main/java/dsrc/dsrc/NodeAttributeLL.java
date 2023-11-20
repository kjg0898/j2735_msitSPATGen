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
 * Define the ASN1 Type NodeAttributeLL from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class NodeAttributeLL extends Enumerated {
    
    /**
     * The default constructor.
     */
    private NodeAttributeLL()
    {
	super(cFirstNumber);
    }
    
    protected NodeAttributeLL(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long reserved = 0;
	public static final long stopLine = 1;
	public static final long roundedCapStyleA = 2;
	public static final long roundedCapStyleB = 3;
	public static final long mergePoint = 4;
	public static final long divergePoint = 5;
	public static final long downstreamStopLine = 6;
	public static final long downstreamStartNode = 7;
	public static final long closedToTraffic = 8;
	public static final long safeIsland = 9;
	public static final long curbPresentAtStepOff = 10;
	public static final long hydrantPresent = 11;
	
    }
    // Named list definitions.
    private final static NodeAttributeLL cNamedNumbers[] = {
	new NodeAttributeLL(), 
	new NodeAttributeLL(1), 
	new NodeAttributeLL(2), 
	new NodeAttributeLL(3), 
	new NodeAttributeLL(4), 
	new NodeAttributeLL(5), 
	new NodeAttributeLL(6), 
	new NodeAttributeLL(7), 
	new NodeAttributeLL(8), 
	new NodeAttributeLL(9), 
	new NodeAttributeLL(10), 
	new NodeAttributeLL(11)
    };
    public static final NodeAttributeLL reserved = cNamedNumbers[0];
    public static final NodeAttributeLL stopLine = cNamedNumbers[1];
    public static final NodeAttributeLL roundedCapStyleA = cNamedNumbers[2];
    public static final NodeAttributeLL roundedCapStyleB = cNamedNumbers[3];
    public static final NodeAttributeLL mergePoint = cNamedNumbers[4];
    public static final NodeAttributeLL divergePoint = cNamedNumbers[5];
    public static final NodeAttributeLL downstreamStopLine = cNamedNumbers[6];
    public static final NodeAttributeLL downstreamStartNode = cNamedNumbers[7];
    public static final NodeAttributeLL closedToTraffic = cNamedNumbers[8];
    public static final NodeAttributeLL safeIsland = cNamedNumbers[9];
    public static final NodeAttributeLL curbPresentAtStepOff = cNamedNumbers[10];
    public static final NodeAttributeLL hydrantPresent = cNamedNumbers[11];
    
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
	if (value >= 0 && value <= 11)
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
    
    public static NodeAttributeLL valueOf(long value)
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
	    "NodeAttributeLL"
	),
	new QName (
	    "DSRC",
	    "NodeAttributeLL"
	),
	274454,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "reserved",
		    0
		),
		new MemberListElement (
		    "stopLine",
		    1
		),
		new MemberListElement (
		    "roundedCapStyleA",
		    2
		),
		new MemberListElement (
		    "roundedCapStyleB",
		    3
		),
		new MemberListElement (
		    "mergePoint",
		    4
		),
		new MemberListElement (
		    "divergePoint",
		    5
		),
		new MemberListElement (
		    "downstreamStopLine",
		    6
		),
		new MemberListElement (
		    "downstreamStartNode",
		    7
		),
		new MemberListElement (
		    "closedToTraffic",
		    8
		),
		new MemberListElement (
		    "safeIsland",
		    9
		),
		new MemberListElement (
		    "curbPresentAtStepOff",
		    10
		),
		new MemberListElement (
		    "hydrantPresent",
		    11
		)
	    }
	),
	0,
	reserved
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NodeAttributeLL object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NodeAttributeLL object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Methods for "unknownEnumerator"
     */
    private static final NodeAttributeLL cUnknownEnumerator = 
	new NodeAttributeLL(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    public Enumerated getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for NodeAttributeLL
