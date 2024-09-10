public class Author
{

    public String name, email,nationality;


    public Author(String name,String email,String nationality)
    {
       this.name = name;
       this.email = email;
       this.nationality = nationality;
    }


    public String etName()
    {
        return name;
    }

    public String getEmail(){
        return email;
    }
    
    public String getNationality()
    {
        return nationality;
    }





    public String toString()
    {

        return( "name: " + name +  "email: " + email +  " nationality: " + nationality);


    }





}