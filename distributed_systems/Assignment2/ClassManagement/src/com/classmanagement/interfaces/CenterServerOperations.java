package com.classmanagement.interfaces;


import com.classmanagement.exceptions.*;

/**
* CenterServerIdl/CenterServerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CenterServerIdl.idl
* Sunday, June 18, 2017 12:56:33 PM EDT
*/

public interface CenterServerOperations 
{
  String createTRecord (String firstName, String lastName, String address, String phone, String specialization,
                        String location, String managerId) throws InvalidLastNameException;
  String createSRecord (String firstName, String lastName, String coursesRegistered, String status, String statusDate,
                        String managerId) throws InvalidLastNameException;
  String getRecordCounts (String managerId);
  void editRecord (String recordID, String fieldName, String newValue, String managerId) throws FieldNotFoundException,
          RecordNotFoundException, InvalidValueException;
  String show (String recordId) throws RecordNotFoundException;
  String transferRecord (String managerId, String recordId, String remoteCenterServerName) throws RecordNotFoundException,
          RecordBeingTransferred;
} // interface CenterServerOperations