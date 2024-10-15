function App() {

    return (
        <div className="bg-custom-gradient h-[38rem] w-[24rem] border-r-[15px] flex-col justify-evenly items-center gap-[0.5rem]">
          <div className="mt-4 flex-row justify-center items-center gap-4">
              <input className="h-10 border-r-[15px] border-none outline-none py-0 px-4 transition-width duration-500 ease-in-out max-w-[calc(24rem * 0.58)]" type="search" placeholder="Enter a location"/>
              <div className="h-10 w-10 bg-white border-r-[50%] cursor-pointer flex-row justify-center items-center gap-4" title="Search">
                  <img className="h-6" src="./images/search.png" alt=""/>
              </div>
              <div className="h-10 w-10 bg-white border-r-[50%] cursor-pointer flex-row justify-center items-center gap-4" title="Use Current Location">
                  <i className="fa-solid fa-location-dot location-icon"></i>
              </div>
          </div>
          <div className="flex-col justify-evenly items-center gap-[0.5rem]">
              <img className="h-28 mx-6 my-0" src="" alt=""/>
              <h1 className="mt-[-0.5rem] mb-[-0.1rem]">
                  <span className="temperature-value"></span>&deg;C
              </h1>
              <br/>
              <span>Feels like <span className="feels-like-temperature-value"></span>&deg;C</span>
              <h2 className="mb-[-0.1rem] weather-description"></h2>
              <h3 className="location"></h3>
              <small>Last Updated <span className="last-updated-info"></span></small>
          </div>
          <div className="info-container-2 flex-row justify-center items-center gap-4">
              <div className="humidity-info row-flex-container">
                  <img className="humidity-icon h-8" src="./images/humidity.png" alt="humidity-icon"/>
                  <div className="prop-value-container flex-col justify-evenly items-center gap-[0.5rem]">
                      <div><span className="humidity-value"></span>%</div>
                      <div>Humidity</div>
                  </div>
              </div>
              <div className="wind-info flex-row justify-center items-center gap-4">
                  {/* <img className="h-8 w-8" src="./images/wind.png" alt="wind-icon"/> */}
                  <div id="wind-dir-compass" className="flex-row justify-center items-center relative">
                      <img id="wind-dir-compass-outer" className="invert" src="./images/compass-icon-outer.png" alt=""/>
                      <img id="wind-dir-compass-arrow" className="absolute transition-transform 500 ease-in-out" src="./images/compass-icon-arrow.png" alt=""/>
                  </div>
                  <div className="prop-value-container flex-col justify-evenly items-center gap-[0.5rem]">
                      <div>
                          <span className="wind-speed-value"></span> kph
                      </div>
                      <div>Wind</div>
                  </div>
              </div>
          </div>
      </div>
    )
  }
  
  export default App;