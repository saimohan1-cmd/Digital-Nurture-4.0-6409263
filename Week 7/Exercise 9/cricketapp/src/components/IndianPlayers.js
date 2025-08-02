import React from 'react'
const T20Players = ['First Player','Second Player','Third Player'];
const RanjiTrophyPlayers = ['Fourth Player','Fifth Player','Sixth Player'];
export const IndianPlayers = [...T20Players,...RanjiTrophyPlayers];
export default function ListOfIndianPlayers({players}) {
  return (
    <div>
      <h2>List of Indian Players Merged</h2>
      <ul>
        {players.map((player,ind)=>{
          return <li key={ind}>Mr. {player}</li>
        })}
      </ul>
    </div>
  )
}
