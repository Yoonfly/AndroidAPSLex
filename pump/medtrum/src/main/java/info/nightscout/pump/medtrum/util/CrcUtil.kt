object CrcUtils {

    private val lookupTable: UByteArray = ubyteArrayOf(0u, 155u, 173u, 54u, 193u, 90u, 108u, 247u, 25u, 130u, 180u, 47u, 216u, 67u, 117u, 238u, 50u, 169u, 159u, 4u, 243u, 104u, 94u, 197u, 43u, 176u, 134u, 29u, 234u, 113u, 71u, 220u, 100u, 255u, 201u, 82u, 165u, 62u, 8u, 147u, 125u, 230u, 208u, 75u, 188u, 39u, 17u, 138u, 86u, 205u, 251u, 96u, 151u, 12u, 58u, 161u, 79u, 212u, 226u, 121u, 142u, 21u, 35u, 184u, 200u, 83u, 101u, 254u, 9u, 146u, 164u, 63u, 209u, 74u, 124u, 231u, 16u, 139u, 189u, 38u, 250u, 97u, 87u, 204u, 59u, 160u, 150u, 13u, 227u, 120u, 78u, 213u, 34u, 185u, 143u, 20u, 172u, 55u, 1u, 154u, 109u, 246u, 192u, 91u, 181u, 46u, 24u, 131u, 116u, 239u, 217u, 66u, 158u, 5u, 51u, 168u, 95u, 196u, 242u, 105u, 135u, 28u, 42u, 177u, 70u, 221u, 235u, 112u, 11u, 144u, 166u, 61u, 202u, 81u, 103u, 252u, 18u, 137u, 191u, 36u, 211u, 72u, 126u, 229u, 57u, 162u, 148u, 15u, 248u, 99u, 85u, 206u, 32u, 187u, 141u, 22u, 225u, 122u, 76u, 215u, 111u, 244u, 194u, 89u, 174u, 53u, 3u, 152u, 118u, 237u, 219u, 64u, 183u, 44u, 26u, 129u, 93u, 198u, 240u, 107u, 156u, 7u, 49u, 170u, 68u, 223u, 233u, 114u, 133u, 30u, 40u, 179u, 195u, 88u, 110u, 245u, 2u, 153u, 175u, 52u, 218u, 65u, 119u, 236u, 27u, 128u, 182u, 45u, 241u, 106u, 92u, 199u, 48u, 171u, 157u, 6u, 232u, 115u, 69u, 222u, 41u, 178u, 132u, 31u, 167u, 60u, 10u, 145u, 102u, 253u, 203u, 80u, 190u, 37u, 19u, 136u, 127u, 228u, 210u, 73u, 149u, 14u, 56u, 163u, 84u, 207u, 249u, 98u, 140u, 23u, 33u, 186u, 77u, 214u, 224u, 123u)

    fun calcCrc8(value: ByteArray, size: Int): Byte {
        var crc8: UByte = 0u
        for (i in 0 until size) {
            val tableIndex: UByte = (value[i].toUByte() xor crc8)
            crc8 = lookupTable[tableIndex.toInt()]
        }
        return crc8.toByte()
    }
}
