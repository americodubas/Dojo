/**
 * Desenvolva um programa que simule a entrega de notas quando um cliente efetuar um saque em um caixa eletrônico. Os requisitos básicos são os seguintes:
 * Entregar o menor número de notas;
 * É possível sacar o cash solicitado com as notas disponíveis;
 * Saldo do cliente infinito;
 * Quantidade de notas infinito (pode-se colocar um cash finito de cédulas para aumentar a dificuldade do problema);
 * notas disponíveis de R$ 100,00; R$ 50,00; R$ 20,00 e R$ 10,00
 * Exemplos:
 * cash do Saque: R$ 30,00 – Resultado Esperado: Entregar 1 nota de R$20,00 e 1 nota de R$ 10,00.
 * cash do Saque: R$ 80,00 – Resultado Esperado: Entregar 1 nota de R$50,00 1 nota de R$ 20,00 e 1 nota de R$ 10,00.
 */
class ATMachine {

    fun withdraw(amount: Int): Array<Int> {
        var cash = amount
        val availableBills =  arrayOf(100,50,20,10)
        val bills = arrayOf(0, 0, 0, 0)

        println()
        println("withdraw amount: $cash")

        var i = 0
        while(cash > 0 && i != availableBills.size) {
            if ( cash >= availableBills[i] ) {
                cash -= availableBills[i]
                bills[i] += 1
            } else {
                i++
            }
        }

        i = 0
        bills.forEach {
            println("$it bills of ${availableBills[i]}")
            i++
        }
        println("remaining cash: $cash")

        return bills
    }
}