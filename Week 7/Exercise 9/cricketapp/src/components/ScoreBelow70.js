import React from 'react'

export default function ScoreBelow70({players}) {
  const players70 = []
  players.map(player=>{
    if(player.score<=70){
        players70.push(player);
    }
  })
  return (
    <div>
      <h2>Players below 70</h2>
            <ul>
                {players70.map((player,ind)=>{
                    return <li key={ind}>Mr . {player.name}- Score: {player.score}</li>
                })}
            </ul>
    </div>
  )
}
