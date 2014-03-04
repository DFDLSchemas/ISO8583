ISO8583-1 Financial transaction card originated messages -- Interchange message specifications -- Part 1: Messages, data elements and code values
=================================================================================================================================================

This GitHub repository holds DFDL schemas that model ISO8583 credit/debit card messages. 
There are DFDL schemas for the two most popular releases of the standard:

    ISO8583-1:1987 
    ISO8583-1:1993 (coming soon)

To download the repository go to http://dfdlschemas.github.com/ISO8583/.

----------------
ISO8583 messages consist of a number of optional fixed-length or prefixed-length fields without initiators.
The presence of a given field in the message is indicated by the setting of a corresponding bit in a bitmap.
The bitmaps occur near the start of the message, and can either be in 'packed' format where each bitmap is 
encoded as 8 bytes of binary data (8 bits per byte), or in 'unpacked' format where each bitmap is encoded 
as 16 text characters (4 bits per character). 

The DFDL schemas for ISO8583 are in the '1987' and 'Common' folders, and support both 'packed' and 'unpacked' formats.

Test data and infosets are included.

The DFDL schemas are compatible with IBM DFDL 1.0 and 1.1 releases, as shipped in IBM WebSphere Message Broker 8.0.0.2
onwards and IBM Integration Bus 9.0.0.1 onwards, respectively.

Note that the dfdl:occursCount expressions used in the model for the 'unpacked' format use the fn:contains() function. 
A more natural approach is to use the dfdl:testBit function but that is not yet supported by IBM DFDL.

----------------
IBM WebSphere Message Broker and IBM Integration Bus

It is recommended that each folder becomes a folder of the same name in a single library project.

----------------
ISO8583:1 1987 and ISO8583:1 1993 editions of the specification have been superseded by the ISO8583:1 2003 edition.

ISO Standards can be obtained in PDF or hard copy formats from the ISO store: http://www.iso.org/iso/home/store.htm

Please observe the copyright notice within each schema.

