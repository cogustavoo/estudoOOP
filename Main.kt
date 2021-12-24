//tratar tudo como objeto

//carros, animais, usuario, pessoa, rg , cpf

//MOLDE (TEMPLATE)
//class (molde responsavel por criar N objetos (propriedades | comportamentos)

// objeto e a instancia (a criacao) a partir daquele molde
// uma vez modificado o molde, TODOS os objetos que saem vao receber a atualizacao


//CONSTRUCTOR

fun main(args: Array<String>) {
    val userA = User("Tiago", true)
    userA.name = "Tiago"
    println(userA.getNameLenght())

    //userA.printoUpperCase()
    //userA.updateName("Thiago")
    //userA.printoUpperCase()
    //val buttonSuccess = Button()
    //buttonSuccess.text = "Sucesso"
    //buttonSuccess.color = "FF0000"
    //val namelength = userA.getNameLenght()
    //println(namelength)

    val userB = User("Gustavo",)
    userB.name = "Gustavo"
    println(userB.getNameLenght())

    val userC = User()
    println(userC.getNameLenght())
}




