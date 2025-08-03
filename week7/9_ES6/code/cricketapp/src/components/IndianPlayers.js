import React from 'react';

const IndianPlayers = () => {
  const players = [
    "Virat Kohli", "Rohit Sharma", "KL Rahul", "Rishabh Pant",
    "Hardik Pandya", "Jasprit Bumrah", "Ravindra Jadeja", "Mohammed Shami"
  ];

  // Destructuring for odd/even teams
  const [player1, player2, player3, player4, player5, player6, player7, player8] = players;
  const oddTeam = [player1, player3, player5, player7];
  const evenTeam = [player2, player4, player6, player8];

  // Merging arrays
  const T20players = ["Virat Kohli", "Rohit Sharma", "KL Rahul"];
  const RanjiTrophy = ["Cheteshwar Pujara", "Ajinkya Rahane", "Hanuma Vihari"];
  const mergedPlayers = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {oddTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {evenTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Merged Players (T20 + Ranji)</h2>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;