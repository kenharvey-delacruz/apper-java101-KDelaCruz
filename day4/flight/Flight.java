package flight;

public class Flight {

    //anything declared within these curly braces are called instance variables
    int seats; //this is called instance variable, declaration is outside
    int passengers;

    Flight (){
        seats = 10;
        passengers = 0;
    }

    // TODO validate if there are available seats left. If not display "Full"
    public void addPassenger(){
        if(this.seats == this.passengers){
            System.out.println("Full");
        } else {
            passengers++;
        }
    }

    // TODO set new value of seat so addPassenger is allowed again
    public void setNumberOfSeats(int seats){
        // this.seats vs seats
        // use ctrl+click to check which variable is being used/referenced by a certain line
        // this.seats uses the instance variable
        // seats uses the local variable passed into the method
        this.seats = 20;
        // seats = 20;
    }





}
