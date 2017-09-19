/*
 * Copyright (c) 2016 Open Baton (http://www.openbaton.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.openbaton.catalogue.mano.descriptor;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Version;

/**
 * Created by lto on 06/02/15.
 *
 * <p>Based on ETSI GS NFV-MAN 001 V1.1.1 (2014-12)
 *
 * <p>A policy or rule to apply to the NFP
 */
@Entity
public class Connection implements Serializable {

  @Version private int version = 0;
  private String VNFD;
  private String CP;

  public Connection() {}

  public String getVNFD() {
    return VNFD;
  }

  public void setVNFD(String VNFD) {
    this.VNFD = VNFD;
  }

  public String getCP() {
    return CP;
  }

  public void setCP(String CP) {
    this.CP = CP;
  }
}
