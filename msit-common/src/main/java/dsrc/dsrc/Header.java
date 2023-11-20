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
 * Define the ASN1 Type Header from ASN1 Module DSRC.
 * @see Sequence
 */

public class Header extends Sequence {
    
    /**
     * The default constructor.
     */
    public Header()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Header(DYear year, MinuteOfTheYear timeStamp, DSecond secMark, 
		    MsgCount msgIssueRevision)
    {
	setYear(year);
	setTimeStamp(timeStamp);
	setSecMark(secMark);
	setMsgIssueRevision(msgIssueRevision);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DYear();
	mComponents[1] = new MinuteOfTheYear();
	mComponents[2] = new DSecond();
	mComponents[3] = new MsgCount();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new DYear();
	    case 1:
		return new MinuteOfTheYear();
	    case 2:
		return new DSecond();
	    case 3:
		return new MsgCount();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "year"
    public DYear getYear()
    {
	return (DYear)mComponents[0];
    }
    
    public void setYear(DYear year)
    {
	mComponents[0] = year;
    }
    
    public boolean hasYear()
    {
	return componentIsPresent(0);
    }
    
    public void deleteYear()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "timeStamp"
    public MinuteOfTheYear getTimeStamp()
    {
	return (MinuteOfTheYear)mComponents[1];
    }
    
    public void setTimeStamp(MinuteOfTheYear timeStamp)
    {
	mComponents[1] = timeStamp;
    }
    
    public boolean hasTimeStamp()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTimeStamp()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "secMark"
    public DSecond getSecMark()
    {
	return (DSecond)mComponents[2];
    }
    
    public void setSecMark(DSecond secMark)
    {
	mComponents[2] = secMark;
    }
    
    public boolean hasSecMark()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSecMark()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "msgIssueRevision"
    public MsgCount getMsgIssueRevision()
    {
	return (MsgCount)mComponents[3];
    }
    
    public void setMsgIssueRevision(MsgCount msgIssueRevision)
    {
	mComponents[3] = msgIssueRevision;
    }
    
    public boolean hasMsgIssueRevision()
    {
	return componentIsPresent(3);
    }
    
    public void deleteMsgIssueRevision()
    {
	setComponentAbsent(3);
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
	    "Header"
	),
	new QName (
	    "DSRC",
	    "Header"
	),
	274454,
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
				"DYear"
			    ),
			    new QName (
				"DSRC",
				"DYear"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DYear(0), 
				    new DYear(4095),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(4095)
			    ),
			    null
			)
		    ),
		    "year",
		    0,
		    3,
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
				"MinuteOfTheYear"
			    ),
			    new QName (
				"DSRC",
				"MinuteOfTheYear"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MinuteOfTheYear(0), 
				    new MinuteOfTheYear(527040),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(527040)
			    ),
			    null
			)
		    ),
		    "timeStamp",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"DSecond"
			    ),
			    new QName (
				"DSRC",
				"DSecond"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DSecond(0), 
				    new DSecond(65535),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(65535)
			    ),
			    null
			)
		    ),
		    "secMark",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"MsgCount"
			    ),
			    new QName (
				"DSRC",
				"MsgCount"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MsgCount(0), 
				    new MsgCount(127),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(127)
			    ),
			    null
			)
		    ),
		    "msgIssueRevision",
		    3,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Header object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Header object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Header
