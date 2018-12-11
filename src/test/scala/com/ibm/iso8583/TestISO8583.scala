package com.ibm.iso8583

import org.junit.AfterClass
import org.junit.Test
import org.apache.daffodil.tdml.Runner

object TestISO8583 {
  val runner = Runner("/com/ibm/iso8583/", "ISO8583.tdml")

  @AfterClass def shutDown {
    runner.reset
  }
}

class TestISO8583 {

  import TestISO8583._

  @Test def test_iso8583_1993_1() = { runner.runOneTest("iso8583_1993_1") }
  @Test def test_iso8583_1993_2() = { runner.runOneTest("iso8583_1993_2") }
  @Test def test_iso8583_1993_1_Unpacked() = { runner.runOneTest("iso8583_1993_1_Unpacked") }
  @Test def test_iso8583_1993_2_Unpacked() = { runner.runOneTest("iso8583_1993_2_Unpacked") }

  @Test def test_iso8583_1987_1() = { runner.runOneTest("iso8583_1987_1") }
  @Test def test_iso8583_1987_2() = { runner.runOneTest("iso8583_1987_2") }
  @Test def test_iso8583_1987_3() = { runner.runOneTest("iso8583_1987_3") }
  @Test def test_iso8583_1987_1_Unpacked() = { runner.runOneTest("iso8583_1987_1_Unpacked") }
  @Test def test_iso8583_1987_2_Unpacked() = { runner.runOneTest("iso8583_1987_2_Unpacked") }
  @Test def test_iso8583_1987_3_Unpacked() = { runner.runOneTest("iso8583_1987_3_Unpacked") }
}
