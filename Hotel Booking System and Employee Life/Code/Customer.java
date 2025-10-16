public abstract class Customer {
    // Constructor Attribute
        private String First_Name;
        private String Last_Name;
        private String Email;
        private String Phone_Number;

    // Constructor    
        public Customer(String First_Name, String Last_Name, String Email, String Phone_Number){
            this.First_Name = First_Name;
            this.Last_Name = Last_Name;
            this.Email = Email;
            this.Phone_Number = Phone_Number;
        }

    // Getters and Setters
        public String getFirst_Name() {
            return First_Name;
        }

        public void setFirst_Name(String first_Name) {
            First_Name = first_Name;
        }

        public String getLast_Name() {
            return Last_Name;
        }

        public void setLast_Name(String last_Name) {
            Last_Name = last_Name;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }

        public String getPhone_Number() {
            return Phone_Number;
        }

        public void setPhone_Number(String phone_Number) {
            Phone_Number = phone_Number;
        }

    // Abstract Method
        public abstract String Payment_Process();

    // Concrete Method
        public String Thank_You_Message(){
            String out = this.getFirst_Name() + " " + this.getLast_Name() + " Thank you for rooming with us. Have a great Stay.";
            return out;
        }

}
