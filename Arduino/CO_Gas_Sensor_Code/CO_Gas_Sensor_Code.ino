const int AOUTpin=0;
const int DOUTpin=8;
const int LEDpin=13;
int limit;
int value;
void setup() 
{
  Serial.begin(115200);
  pinMode(DOUTpin,INPUT);
  pinMode(LEDpin,OUTPUT);
}

void loop()
{
  int value=analogRead(AOUTpin);
  int limit=digitalRead(DOUTpin);
  Serial.print("CO Value : ");
  Serial.print(value);
  Serial.print("\n");
  Serial.print("Limit : \n");
  Serial.print(limit);
  Serial.print("\n");
  delay(100);
  if(limit==HIGH)
  {
    digitalWrite(LEDpin,HIGH);
  }
  else
  {
    digitalWrite(LEDpin,LOW);
  } 
}
