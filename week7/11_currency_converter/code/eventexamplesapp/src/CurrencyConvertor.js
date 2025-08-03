import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState('');
  const [conversionRate] = useState(0.011); // Approx 1 INR = 0.011 EUR

  const handleSubmit = (e) => {
    e.preventDefault();
    if (rupees) {
      const converted = parseFloat(rupees) * conversionRate;
      setEuros(converted.toFixed(2));
    }
  };

  return (
    <div className="currency-convertor">
      <h2>Currency Convertor</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>
            Indian Rupees:
            <input
              type="number"
              value={rupees}
              onChange={(e) => setRupees(e.target.value)}
              placeholder="Enter amount in INR"
            />
          </label>
        </div>
        <button type="submit">Convert to Euros</button>
      </form>
      {euros && <p>Converted Amount: €{euros}</p>}
    </div>
  );
}

export default CurrencyConvertor;