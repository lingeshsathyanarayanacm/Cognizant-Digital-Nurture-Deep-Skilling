import React, { useState } from 'react';
import './App.css';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const [username, setUsername] = useState('');

  // Flight data
  const flights = [
    { id: 1, airline: 'Air India', departure: 'DEL', arrival: 'BOM', time: '08:00', price: 4500 },
    { id: 2, airline: 'IndiGo', departure: 'DEL', arrival: 'BLR', time: '10:30', price: 5200 },
    { id: 3, airline: 'SpiceJet', departure: 'DEL', arrival: 'MAA', time: '13:15', price: 4800 },
    { id: 4, airline: 'Vistara', departure: 'DEL', arrival: 'HYD', time: '16:45', price: 6100 }
  ];

  const handleLogin = () => {
    const user = prompt('Enter your username:');
    if (user) {
      setUsername(user);
      setIsLoggedIn(true);
    }
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
    setUsername('');
  };

  const handleBook = (flightId) => {
    alert(`Ticket booked for flight ${flightId}!`);
  };

  return (
    <div className="App">
      <header>
        <h1>Flight Ticket Booking</h1>
        {isLoggedIn ? (
          <div className="user-controls">
            <span>Welcome, {username}!</span>
            <button onClick={handleLogout}>Logout</button>
          </div>
        ) : (
          <button onClick={handleLogin}>Login</button>
        )}
      </header>

      <div className="flights-container">
        <h2>Available Flights</h2>
        <table>
          <thead>
            <tr>
              <th>Airline</th>
              <th>Route</th>
              <th>Time</th>
              <th>Price (₹)</th>
              <th>Action</th>
            </tr>
          </thead>
          <tbody>
            {flights.map(flight => (
              <tr key={flight.id}>
                <td>{flight.airline}</td>
                <td>{flight.departure} → {flight.arrival}</td>
                <td>{flight.time}</td>
                <td>{flight.price}</td>
                <td>
                  {isLoggedIn ? (
                    <button onClick={() => handleBook(flight.id)}>Book Now</button>
                  ) : (
                    <span>Login to book</span>
                  )}
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>

      {isLoggedIn && (
        <div className="user-dashboard">
          <h2>User Dashboard</h2>
          <p>Manage your bookings and preferences here.</p>
        </div>
      )}
    </div>
  );
}

export default App;