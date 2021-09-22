package tilelink

import chisel3._ 
import chisel3.util._ 


class TLRequest(implicit val config:TilelinkConfig) extends Bundle {
    val addrRequest = UInt(config.a.W)
    val dataRequest = UInt((config.w * 8).W)
    val activaByteLane = UInt(config.w.W)
    val isWrite = Bool()
}

class TLResponse(implicit val config:TilelinkConfig) extends Bundle {
    val dataResponse = UInt((config.w * 8).W)
    val error = Bool() 
}