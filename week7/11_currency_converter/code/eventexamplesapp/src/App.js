import React, { useState } from 'react';
import './App.css';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  // Counter state
  const [count, setCount] = useState(0);

  // Event handlers for counter
  const increment = () => {
    setCount(count + 1);
  };

  const sayHello = () => {
    alert("Hello! This is a static message.");
  };

  const handleIncrement = (e) => {
    increment();
    sayHello();
  };

  const decrement = () => {
    setCount(count - 1);
  };

  // Welcome message handler
  const sayWelcome = (message) => {
    alert(`${message} to our event examples app!`);
  };

  // Synthetic event handler
  const handleClick = (e) => {
    console.log(e); // Synthetic event object
    alert("I was clicked");
  };

  return (
    <div className="App">
      <h1>React Event Examples</h1>
      
      <div className="counter-section">
        <h2>Counter: {count}</h2>
        <button onClick={increment}>Increment</button>
        <button onClick={decrement}>Decrement</button>
        <button onClick={handleIncrement}>Increase (Multiple Methods)</button>
      </div>

      <div className="welcome-section">
        <button onClick={() => sayWelcome("Welcome")}>Say Welcome</button>
      </div>

      <div className="synthetic-event-section">
        <button onClick={handleClick}>Click Me (Synthetic Event)</button>
      </div>

      <CurrencyConvertor />
    </div>
  );
}

export default App;