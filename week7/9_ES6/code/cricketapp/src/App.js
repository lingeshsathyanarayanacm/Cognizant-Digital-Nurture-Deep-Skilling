import React, { useState } from 'react';
import ListofPlayers from './components/ListofPlayers';
import IndianPlayers from './components/IndianPlayers';

function App() {
  const [flag, setFlag] = useState(true);

  return (
    <div className="App">
      <button onClick={() => setFlag(!flag)}>
        {flag ? "Show Indian Players" : "Show All Players"}
      </button>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;