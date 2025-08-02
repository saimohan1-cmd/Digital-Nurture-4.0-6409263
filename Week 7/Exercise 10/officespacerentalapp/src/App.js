import office_image from './office_space_img.jpg';
import './App.css';
import OfficeDetails from './components/OfficeDetails';

function App() {
  const OfficeList = [{name : "DBS",rent:50000,address:"Chennai",image:office_image}]
  return (
    <div>
      <h1>Office Space Rental</h1>
      {OfficeList.map((office,index)=>{
        return <OfficeDetails office={office}></OfficeDetails>
      })}
    </div>
  );
}

export default App;
