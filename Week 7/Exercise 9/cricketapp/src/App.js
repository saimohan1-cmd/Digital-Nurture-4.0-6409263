import './App.css';
import EvenPlayer from './components/EvenPlayer';
import ListOfIndianPlayers, { IndianPlayers } from './components/IndianPlayers';
import ListOfPlayers from './components/ListOfPlayers';
import OddPlayer from './components/OddPlayer';
import ScoreBelow70 from './components/ScoreBelow70';
const players = [
        { name:'Jack', score:50},
        { name:'Micheal', score:70},
        { name:'John', score:40},
        { name:'Ann', score:61},
        { name:'Elisabeth', score:61},
        { name:'Sachin', score:95},
        { name:'Dhoni', score:100},
        { name:'Virat', score:84},
        { name:'Jadeja', score:64},
        { name:'Raina', score:75},
        { name:'Rohit', score:80}
    ]
function App() {
  const flag = false;
  if(flag==false){
    return(
    <>
    <div>
      <h1>Odd players</h1>
      <OddPlayer players={IndianPlayers}></OddPlayer>
    </div>
    <div>
      <h1>Even players</h1>
      <EvenPlayer players={IndianPlayers}></EvenPlayer>
    </div>
    <div>
      <ListOfIndianPlayers players={IndianPlayers}></ListOfIndianPlayers>
    </div>
    </>
    )
  }
  else{
  return (
    <>
    <ListOfPlayers players={players}></ListOfPlayers>
    <ScoreBelow70 players = {players}></ScoreBelow70>
    </>
    
  );
  }
}

export default App;
