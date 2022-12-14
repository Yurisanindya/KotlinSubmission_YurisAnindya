@file:Suppress("UNREACHABLE_CODE")

package id.infinitelearning.KotlinSubmission.exercise1

import jdk.jfr.Name

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan cetak setiap variabel ke layar saat variable myProfile di panggil
 */


fun myProfile() {
    val firstName: String = "Yuris"
    val lastName: String = "Kurniawan"
    val umur = 21
    val Single = true
    val Tidak = false
    println("Nama saya adalah $firstName nama belakang saya $lastName umur saya $umur" )
    println("Status saya " + (Single > Tidak))
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */

fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {
    return arrayOf(groupId, groupMember, session)
    println(groupId)
    println(groupMember)
    println(session)
}






/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myName ini
 *
 */
fun myName(): String {
    val grupMember:String = "Yuris, Luciana, Andika, Thariqi, Sandy"
    println("Nama anggota grup saya = $grupMember")
    return "Yuris Anindya Kurniawan"
}


/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Sani", "Ardy", "Reza")
    val countOfGroup = 5

    return (mentor.count() + countOfGroup)

}

fun main() {

    myProfile()
    val myName = myName()
    println("My Name is: $myName")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")


    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(3, listOf("Yuris", "Luciana", "Sandy", "Thariqi", "Sandy"), "Afternoon")
}