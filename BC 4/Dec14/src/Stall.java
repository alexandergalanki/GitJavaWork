public class Stall implements Runnable {
    private  String stallName;
private String details;

private double stallArea;
private String owner;
private double stallCost;

public Stall()
{

}

public Stall(String stallName, String details, Double stallArea, String owner)
{
this.stallName=stallName;
this.details=details;
this.stallArea=stallArea;
this.owner=owner;

}



public String getStallName() {
return stallName;
}

public void setStallName(String stallName) {
this.stallName = stallName;
}

public String getDetails() {
return details;
}

public void setDetails(String details) {
this.details = details;
}

public double getStallArea() {
return stallArea;
}

public void setStallArea(double stallArea) {
this.stallArea = stallArea;
}

public String getOwner() {
return owner;
}

public void setOwner(String owner) {
this.owner = owner;
}

public double getStallCost() {
return stallCost;
}

public void setStallCost(double stallCost) {
this.stallCost = stallCost;
}

@Override
public void run() {


}


}

