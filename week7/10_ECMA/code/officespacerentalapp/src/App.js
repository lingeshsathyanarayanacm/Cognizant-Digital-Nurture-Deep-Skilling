import React from 'react';
import './App.css';

function App() {
  // Office space data
  const offices = [
    {
      name: "Downtown Executive Suite",
      rent: 55000,
      address: "123 Main St, City Center",
      image: "office1.jpeg" // Replace with actual image URL
    },
    {
      name: "Tech Park Office",
      rent: 75000,
      address: "456 Innovation Ave, Tech District",
      image: "office2.jpeg" // Replace with actual image URL
    },
    {
      name: "River View Workspace",
      rent: 62000,
      address: "789 Riverside Dr, Scenic Area",
      image: "office3.jpeg" // Replace with actual image URL
    }
  ];

  return (
    <div className="App">
      <h1>Office Space Rental</h1>
      
      <div className="office-list">
        {offices.map((office, index) => (
          <div key={index} className="office-card">
            <img src={office.image} alt={office.name} className="office-image" />
            <h2>{office.name}</h2>
            <p><strong>Address:</strong> {office.address}</p>
            <p>
              <strong>Rent:</strong> 
              <span style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
                ₹{office.rent.toLocaleString()}/month
              </span>
            </p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;