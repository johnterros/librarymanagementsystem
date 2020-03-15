interface LibrarySystem
{

    fun lending(lenditemname:String,lenditemid:String)
    fun returning(returnitemname:String,returnitemid:String)
}
class BooksLib(var bookname:String,var bookid:String):LibrarySystem
{
    var bookiddd:String = ""
    var booknameee:String = bookname
    override fun lending(lenditemname: String, lenditemid: String) {
        bookiddd=lenditemname
        if(bookiddd==booknameee)
        {
            println("You can successfully lend $lenditemname with id $lenditemid ")
        }
        else
        {
            println("You cant lend $lenditemname its not in system check with librarian")
        }

    }

    override fun returning(returnitemname: String, returnitemid: String) {
        bookiddd=returnitemname
        if(bookiddd==booknameee)
        {
            println("Successfully returned $returnitemname you are cleared")
        }
        else
        {
            println("Cant return $returnitemname error check with librarian")
        }
    }

}
class UsersLib(var username:String,var userid:String):LibrarySystem
{
    var useriddd:String = userid
    var lenditemidd:String=""
    override fun lending(lenditemname: String, lenditemid: String) {
        lenditemidd=lenditemid
        if(lenditemidd==useriddd)
        {
            println("You have successfully borrowed $lenditemname for short term maximum of two weeks")
        }
        else
        {
            println("$lenditemname cant be borrowed check with librarian or front desk")
        }

    }

    override fun returning(returnitemname: String, returnitemid: String) {
        lenditemidd=returnitemid
        if(lenditemidd==useriddd)
        {
            println("Successfully returned $returnitemname")
        }
        else
        {
            println("Cant return $returnitemname please check with librarian")
        }
    }

}

fun main(args: Array<String>) {
    var book1 = BooksLib("live","live123")
    book1.lending("LIVE","live123")
    book1.returning("live","535")

    var customer1 = UsersLib("jamo","123e4")
    customer1.lending("blooob","123e4")
    customer1.returning("bllob","123e4")
}