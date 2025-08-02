
export default function OfficeDetails({office}) {
    const Rentcolor = office.rent<60000?"red":"green";
  return (
    <div>
        <img src={office.image} width = "25%" height= "25%" alt='Office Image'></img>
      <h2>{office.name}</h2>
      <p>
        <strong style={{color:Rentcolor}}>Rent:{office.rent}</strong>
      </p>
      <p>
        <strong>Address : {office.address}</strong>
      </p>
    </div>
  )
}
