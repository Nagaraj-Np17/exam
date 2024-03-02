package myZoho;

public class Sleep{
public boolean sleepIn(boolean weekday, boolean vacation) {
  if(vacation==true || weekday==false  && vacation==false)  return true;

return false;
}}