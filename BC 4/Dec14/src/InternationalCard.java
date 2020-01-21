public class InternationalCard extends TravelCreditCard
{
    double calculateAmount(Double amount,Integer numberOfPersons)
 {
  return (numberOfPersons*amount)-(10*(numberOfPersons*amount))/100;
 }
 
}