import axios from "axios";
import MovieCard from "components/MovieCard";
import Pagination from "components/Pagination";
import {BASE_URL} from "utils/request"
function Listing() {

  //FORMA ERRADA
axios.get(`${BASE_URL}/movies?size=6&page=1`)
.then(response =>{
  console.log(response.data);
})


  return (
    <>
      <Pagination />

      <div className="container">
        <div className="row">
          <div className="col-sm-6">
            <MovieCard />
          </div>
          <div className="col-sm-6">
            <MovieCard />
          </div>
        </div>
      </div>
    </>
  );
}

export default Listing;
