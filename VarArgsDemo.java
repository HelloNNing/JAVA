����   8 C  unit7/VarArgsDemo  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lunit7/VarArgsDemo; main ([Ljava/lang/String;)V@A      @      @       @L�����
     printMax ([D)V args [Ljava/lang/String;	  !   java/lang/System " # out Ljava/io/PrintStream; % No argument passed
 ' ) ( java/io/PrintStream * + println (Ljava/lang/String;)V - java/lang/StringBuilder / The max value is 
 , 1  +
 , 3 4 5 append (D)Ljava/lang/StringBuilder;
 , 7 8 9 toString ()Ljava/lang/String; numbers [D result D i I StackMapTable 
SourceFile VarArgsDemo.java !               /     *� �    
                    	       m     ;�Y RY RY RY RY R� �YRY RY R� �    
          $         ;     �       �     ;*�� � $� &�*1H>� 
*1H�*����� � ,Y.� 0'� 2� 6� &�    
   & 	                $  :          ; : ;    ) < =    > ?  @   	 �   A    B