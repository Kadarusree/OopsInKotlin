   fun main(){
     var anyBank = Bank("SBI Bank")
       anyBank.giveloans();

   }

   //Exmpleof a primary constructor
   //We can also have default values for constructor arguments
   class Bank constructor(var name : String){
//constructor keyword is optional if we dont declare class as public
       var bankname = name
         fun giveloans(){
             println(" $name Gives loans")
         }
   }