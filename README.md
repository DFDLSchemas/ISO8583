ISO8583-1 Financial transaction card originated messages -- Interchange message specifications -- Part 1: Messages, data elements and code values
=================================================================================================================================================

This GitHub repository holds DFDL schemas that model ISO8583 credit/debit card messages. 
There are DFDL schemas for the two most popular releases of the standard:

    ISO8583-1:1987 
    ISO8583-1:1993 

To download the repository go to http://dfdlschemas.github.com/ISO8583/.

----------------
ISO8583 messages consist of a number of optional fixed-length or prefixed-length fields without initiators.
The presence of a given field in the message is indicated by the setting of a corresponding bit in a bitmap.
The bitmaps occur near the start of the message, and can either be in 'packed' format where each bitmap is 
encoded as 8 bytes of binary data (8 bits per byte), or in 'unpacked' format where each bitmap is encoded 
as 16 text characters (4 bits per character). 

The DFDL schemas for ISO8583 are in the '1987', '1993' and 'Common' folders, and support both 'packed' and 'unpacked' bitmap formats.

Test data and infosets are included.

The DFDL schemas are compatible with IBM DFDL 1.1 release, as shipped in IBM Integration Bus 9.0.0.1 onwards and IBM App Connect Enterprise 11.0.0.0 onwards.

Note that the dfdl:occursCount expressions used in the model for the 'unpacked' format use the fn:contains() function. 
A more natural approach is to use the dfdl:testBit() function but that is not yet supported by IBM DFDL.

The 1987 schemas use absolute paths in the dfdl:occursCount expressions, and do not have a target namespace.
As a contrast, the 1993 schemas use relative paths and have a target namespace. 

Updated June 2015 to correct calendar elements. Only elements that are full dates are modelled as xs:date, and only elements that are full timestamps are modelled as xs:dateTime. Otherwise xs:string is used.

If the ISO8583 message is received over TCP/IP then it is usual for a 2 or 4 byte header to be appended to the start of the data. This is best modeled by changing the dfdl:lengthKind of the ISO8583 message element from 'implicit' to 'prefixed', and creating a suitable simple type for the dfdl:prefixLengthType property.

If modeling ISO8583 messages as used in the People's Republic of China, change dfdl:encoding to 'GB2312'.

----------------
IBM App Connect Enterprise and IBM Integration Bus

It is recommended that each folder becomes a folder of the same name in a single library project.

----------------
ISO8583:1 1987 and ISO8583:1 1993 editions of the specification have been superseded by the ISO8583:1 2003 edition.

ISO Standards can be obtained in PDF or hard copy formats from the ISO store: http://www.iso.org/iso/home/store.htm

Please observe the copyright notice within each schema.

