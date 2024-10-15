#include <SoftwareSerial.h>

SoftwareSerial BTSerial(10, 11); // RX | TX

bool handshakeDone = false;

void setup() {

  Serial.begin(9600);
  BTSerial.begin(9600); // HC-05 default baud rate
  Serial.println("HC-05 is ready.");

  // wait for the handshake message from Python

  while (!handshakeDone) {

    if (BTSerial.available()) {

      String received = BTSerial.readString();
      Serial.print("Received: ");
      Serial.println(received);

      if (received == "200") {

        // send the handshake response back
        BTSerial.println("200");
        Serial.println("Handshake successful. Ready to receive data.");
        handshakeDone = true;
      }
    }
  }
}

void loop() {

  if (BTSerial.available()) {

    String received = BTSerial.readString();
    Serial.print("Received: ");
    Serial.println(received);

    if (received == "A") {

      Serial.println("Entry Permitted....Barrier Lifted");

      // code to control a barrier or other mechanism
    }
  }

  if (Serial.available()) {

    String toSend = Serial.readString();
    BTSerial.print(toSend);
  }
}

////////////////////////////////////////////////////////////////

// SoftwareSerial BTSerial(2, 3); // RX | TX
// int mopen = 7;
// int mclose = 6;
// int buzz = 5;
// int lsopen = 8;
// int lsclose = 9;
// int irsanse = 10;
// int swopen = 11;

// bool handshakeDone = false;

// void setup() {
//   Serial.begin(9600);
//   BTSerial.begin(9600); 
  
//   pinMode(lsopen, INPUT_PULLUP);
//   pinMode(lsclose, INPUT_PULLUP);
//   pinMode(irsanse, INPUT);
//   pinMode(swopen, INPUT_PULLUP);
//   pinMode(mopen, OUTPUT);
//   pinMode(mclose, OUTPUT);
//   pinMode(buzz, OUTPUT);

//   Serial.println("HC-05 is ready.");

//   // wait for the handshake message from Python

//   while (!handshakeDone) {

//     if (BTSerial.available()) {

//       String received = BTSerial.readString();
//       Serial.print("Received: ");
//       Serial.println(received);

//       if (received == "200") {

//         // send the handshake response back
//         BTSerial.println("200");
//         Serial.println("Handshake successful. Ready to receive data.");
//         handshakeDone = true;
//       }
//     }
//   }
// }

// void loop() {

//   if (BTSerial.available()) {
//     String received = BTSerial.readString();
//     Serial.print("Received: ");
//     Serial.println(received);
//      if(received.indexOf("A")>=0){
//       Serial.println("Entry Permitted....Barrier Lifted");
//       while(digitalRead(lsopen) == HIGH){
//         digitalWrite(mopen,HIGH);
//                                         }
//       digitalWrite(mopen,LOW);                                  
//       received = "";                                  
//      }
//   }
//    if(digitalRead(swopen) == LOW){
//        while(digitalRead(lsopen) == HIGH){
//         digitalWrite(mopen,HIGH);
//                                         }
//       digitalWrite(mopen,LOW);
//    }
//   if((digitalRead(irsanse) == HIGH)&&(digitalRead(lsopen) == LOW)){
//     delay(5000);
//     digitalWrite(buzz,HIGH);    
//     while(digitalRead(lsclose) == HIGH){
//         digitalWrite(mclose,HIGH);
//         digitalWrite(buzz,HIGH);
//         if(digitalRead(irsanse) == LOW){
//               digitalWrite(mclose,LOW);
//               digitalWrite(buzz,LOW);
//       while(digitalRead(lsopen) == HIGH){
//              digitalWrite(mopen,HIGH);
//                                         }
//       digitalWrite(mopen,LOW);
//       while(digitalRead(irsanse) == LOW);
//         }
//                                         }
//       digitalWrite(mclose,LOW);
//       digitalWrite(buzz,LOW);
//   }

//   if (Serial.available()) {

//     String toSend = Serial.readString();
//     BTSerial.print(toSend);
//   }
// }
/////// code for handshaking
//
//#include <SoftwareSerial.h>
//
//SoftwareSerial BTSerial(10, 11); // RX | TX
//
//bool handshakeDone = false;
//
//void setup() {
//
//  Serial.begin(9600);
//  BTSerial.begin(9600); // HC-05 default baud rate
//  Serial.println("HC-05 is ready.");
//
//  // wait for the handshake message from Python
//
//  while (!handshakeDone) {
//
//    if (BTSerial.available()) {
//
//      String received = BTSerial.readString();
//      Serial.print("Received: ");
//      Serial.println(received);
//
//      if (received == "200") {
//
//        // send the handshake response back
//        BTSerial.println("200");
//        Serial.println("Handshake successful. Ready to receive data.");
//        handshakeDone = true;
//      }
//    }
//  }
//}
//
//void loop() {
//
//  if (BTSerial.available()) {
//
//    String received = BTSerial.readString();
//    Serial.print("Received: ");
//    Serial.println(received);
//
//    if (received == "1") {
//
//      Serial.println("Entry Permitted....Barrier Lifted");
//
//      // code to control a barrier or other mechanism
//    }
//  }
//
//  if (Serial.available()) {
//
//    String toSend = Serial.readString();
//    BTSerial.print(toSend);
//  }
//}
