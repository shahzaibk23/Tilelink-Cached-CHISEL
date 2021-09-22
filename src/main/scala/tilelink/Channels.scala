package tilelink

import chisel3._
import chisel3.util._ 

class channelABundle(implicit val config:TilelinkConfig) extends Bundle{
    val a_opcode = UInt(3.W)
    val a_param = UInt(3.W)
    val a_size = UInt(config.z.W)
    val a_source = UInt(config.o.W)
    val a_address = UInt(config.a.W)
    val a_mask = UInt(config.w.W)
    val a_corrupt = Bool()
    val a_data = UInt((8*config.w).W)
}

class channelBBundle(implicit val config:TilelinkConfig) extends Bundle {
    val b_opcode = UInt(3.W)
    val b_param = UInt(3.W)
    val b_size = UInt(config.z.W)
    val b_source = UInt(config.o.W)
    val b_address = UInt(config.a.W)
    val b_mask = UInt(config.w.W)
    val b_data = UInt((config.w * 8).W)
    val b_corrupt = Bool()
}

class channelCBundle(implicit val config:TilelinkConfig) extends Bundle {
    val c_opcode = UInt(3.W)
    val c_param = UInt(3.W)
    val c_size = UInt(config.z.W)
    val c_source = UInt(config.o.W)
    val c_address = UInt(config.a.W)
    val c_data = UInt((config.w * 8).W)
    val c_corrupt = Bool()
}

class channelDBundle(implicit val config:TilelinkConfig) extends Bundle {
    val d_opcode = UInt(3.W)
    val d_param = UInt(2.W)
    val d_size = UInt(config.z.W)
    val d_source = UInt(config.o.W)
    val d_sink = UInt(config.i.W)  
    val d_denied = Bool()
    val d_corrupt = Bool()
    val d_data = UInt((8*config.w).W)
}

class channelEBundle(implicit val config:TilelinkConfig) extends Bundle {
    val e_sink = UInt(config.i.W)
}