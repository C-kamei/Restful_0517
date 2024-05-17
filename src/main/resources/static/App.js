const App = () => {
  const [apartments, setApartments] = React.useState([]);

  React.useEffect(() => {
    fetch('http://localhost:8080/apartment')
      .then(response => response.json())
      .then(data => setApartments(data))
      .catch(error => console.error('Error fetching apartments:', error));
  }, []);

  return (
    <div>
      <h1>Apartment List</h1>
      <ul>
        {apartments.map(apartment => (
          <li key={apartment.id}>
            <h2>{apartment.name}</h2>
            <p>Address: {apartment.address}</p>
            <p>Sales Representative: {apartment.salesrep}</p>
            <p>Floor Area: {apartment.floorarea} sqm</p>
            <p>Register Date: {apartment.registerdate}</p>
          </li>
        ))}
      </ul>
    </div>
  );
}
