����   8 Q  %unit9/TestCircleWithPrivateDataFields  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 'Lunit9/TestCircleWithPrivateDataFields; main ([Ljava/lang/String;)V  !unit9/CircleWithPrivateDataFields@      
     (D)V	    java/lang/System   out Ljava/io/PrintStream;  java/lang/StringBuilder   !The area of the circle of radius 
  "  # (Ljava/lang/String;)V
  % & ' 	getRadius ()D
  ) * + append (D)Ljava/lang/StringBuilder; -  is 
  / * 0 -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  2 3 ' getArea
  5 6 7 toString ()Ljava/lang/String;
 9 ; : java/io/PrintStream < # println?񙙙���
  @ A  	setRadius C !The number of objects created is 
  E F G getNumberOfObjects ()I
  I * J (I)Ljava/lang/StringBuilder; args [Ljava/lang/String; myCircle #Lunit9/CircleWithPrivateDataFields; 
SourceFile $TestCircleWithPrivateDataFields.java !               /     *� �    
                    	       �     z� Y � L� � Y� !+� $� (,� .+� 1� (� 4� 8++� $ =k� ?� � Y� !+� $� (,� .+� 1� (� 4� 8� � YB� !� D� H� 4� 8�    
          0  < 	 a  y         z K L    o M N   O    P