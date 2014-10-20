import spock.lang.*



// Hit 'Run Script' below
class MenuSpec extends Specification {
  def steak = 34
  def crepes = 200
  def bill = {}
  def total(){
     return (steak) //+ bill.crepes * c
  }
  def "doit permettre le client de commander 3 steaks"() {
    bill.steak = 1
    bill.steak ++
    bill.steak ++
    expect:
    bill.steak == 3
  }

  def "doit connaitre le prix d'un steak"() {
    expect:
    steak == 34
  }
  def "doit connaitre le prix des crêpes"() {
    expect:
    crepes == 200
  }

  
  def "doit calcule le total avec taxe si le client"() {
    when:
    steak == 34

    and:
    crepes == 200

    bill.steak = 1
    bill.steak ++
    bill.steak ++
    and:
    bill.steak == 3

    bill.crepes = 2
    and:
    bill.crepes == 2

    then:
    total() == 512
  }
  //...
}
​
