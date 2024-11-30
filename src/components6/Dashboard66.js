import { useEffect, useState } from "react";
import axios from "axios";
import './Dashboard6.css';
function Dashboard66() 
{
    const [addresses,setAddresses]=useState([]);
    const [adrUserName, setUserName] = useState();
    const [adrEmail, setEmail] = useState();
    const [adrPhoneNumber, setPhoneNumber] = useState();
    const [adrAddress, setAddress] = useState();
    
  

  useEffect(() => {
    fetchAddresses();
  }, []);

  function fetchAddresses() {
    axios.get("http://localhost:8080/api/address").then((res) => {
        setAddresses(res.data);
    });
  }
  function addAddress() {
    const addressData = {
      userName: adrUserName,
      email: adrEmail,
      phoneNumber: adrPhoneNumber,
      address: adrAddress,
    };

    axios
      .post("http://localhost:8080/api/address", addressData)
      .then((res) => {
        setAddresses([...addresses, res.data]);
        setUserName("");
        setAddress("");
        setPhoneNumber("");
        setEmail("");
      });
  }

  
  return (
   
    <div>
   
   <center>
   <div id="form">
    
   <h2>Add Address</h2>
      <table>
     
   
     
        <tr>
          <td>Name:</td>
          <td><input
          type="text"
          placeholder="Enter name"
          value={adrUserName}
          onChange={(e) => setUserName(e.target.value)}
          required/></td>
        </tr>
        <tr>
          <td>Email:</td>
          <td><input
          type="email"
          placeholder="Enter email ID"
          value={adrEmail}
          onChange={(e) => setEmail(e.target.value)}
           required/></td>
        </tr>
        <tr>
          <td>Phone Number:</td>
          <td><input
  type="text"
  placeholder="Enter phone number"
  value={adrPhoneNumber}
  onChange={(e) => setPhoneNumber(e.target.value)} // Updated to match the state
  required 
/></td>
        </tr>
        <tr>
          <td>Address:</td>
          <td><input
          type="text"
          placeholder="Enter address"
          value={adrAddress}
          onChange={(e) => setAddress(e.target.value)}
          required /></td>
        </tr>
      </table>
      <br></br>
      
          <button onClick={addAddress}>Add</button>
      
        
        </div>
   </center>
    <center>
    <ul>
      <br></br>
      <h2>Address Book</h2>
    {addresses.map((address) => (
          <li key={address.id}>
            ID:   {address.id} ----------  Name:   {address.userName} ---------- Email ID:  {address.email}--------- Phone Number:  {address.phoneNumber}----------Address:  {address.address}
           
           
          </li>
        ))}
      </ul>
    </center>
    
  </div>
  );
}

export default Dashboard66;
