//sobrecarga de construtor

// classes, objetos, contrutor, funcao , propriedades (var, val) PLAYY


//funcoes sao acoes
//var sao valores / priopriedades


// OPCOES DE DECLARACAO
// OPCAO 1 -- SEM VALOR PADRAO + palavra constructor explicita
// class User constructor(var name: String) {}

// OPCAO 2 - valor padrao
//  class User(var name: String = "") {}


//  OPCAO 3 - espera que o constructor recebe o valor (var)
class User(var name: String, var isAdmin: Boolean = false) {
    //var name: String = ""  //propriedade

    constructor(name: String) : this(name, false){
        println("execute constructor 2")
    }

    constructor() : this("unknow", false){
        println("execute constructor 3")
    }

    //responsabilidade
    fun printoUpperCase() {
        println("Hello " + name.uppercase())
    }

    fun updateName(newName: String){
        name = newName //+ "att successful"   // [pde concatenar
    }

    fun getNameLenght(): Int {
        return name.length
    }
}

