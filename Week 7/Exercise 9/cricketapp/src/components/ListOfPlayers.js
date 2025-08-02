    import React from 'react'

    export default function ListOfPlayers({players}) {

    return (
        <div>
            <h2>List of Players</h2>
            <ul>
                {players.map((player,ind)=>{
                    return <li key={ind}>Mr . {player.name}- Score: {player.score}</li>
                })}
            </ul>
        </div>
    );
    }
