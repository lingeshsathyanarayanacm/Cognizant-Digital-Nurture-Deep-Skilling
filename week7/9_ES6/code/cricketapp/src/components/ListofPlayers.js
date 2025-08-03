import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: "Virat Kohli", score: 120 },
    { name: "Rohit Sharma", score: 65 },
    { name: "KL Rahul", score: 45 },
    { name: "Rishabh Pant", score: 80 },
    { name: "Hardik Pandya", score: 70 },
    { name: "Jasprit Bumrah", score: 10 },
    { name: "Ravindra Jadeja", score: 55 },
    { name: "Mohammed Shami", score: 15 },
    { name: "Shreyas Iyer", score: 75 },
    { name: "Yuzvendra Chahal", score: 25 },
    { name: "Bhuvneshwar Kumar", score: 30 }
  ];

  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h2>Players with Scores Below 70</h2>
      <ul>
        {lowScorers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;