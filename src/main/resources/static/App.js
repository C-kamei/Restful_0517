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
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Address</th>
            <th>Sales Representative</th>
            <th>Floor Area (sqm)</th>
            <th>Register Date</th>
          </tr>
        </thead>
        <tbody>
          {apartments.map(apartment => (
            <tr key={apartment.id}>
              <td>{apartment.id}</td>
              <td>{apartment.name}</td>
              <td>{apartment.address}</td>
              <td>{apartment.salesrep}</td>
              <td>{apartment.floorarea}</td>
              <td>{apartment.registerdate}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}
